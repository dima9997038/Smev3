package mipris.smev3.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import mipris.smev3.entity.MnemonicReceiveEntity;
import mipris.smev3.concentrator.modelFormDanaXmlToObject.QueryResult;
import mipris.smev3.repository.ReadMnemonicReceiveRepository;
import mipris.smev3.repository.ReceiveRepository;
import mipris.smev3.telecom.model.ClientMessage;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


import java.util.Optional;

@Service
public class ScheduledService {
    private final ReceiveRepository receiveRepository;
    private final ReadMnemonicReceiveRepository readMnemonicReceiveRepository;
    private final RestClientService restClientService;
    ObjectMapper objectMapper = new XmlMapper();

    public ScheduledService(ReceiveRepository receiveRepository, ReadMnemonicReceiveRepository readMnemonicReceiveRepository, RestClientService restClientService) {
        this.receiveRepository = receiveRepository;
        this.readMnemonicReceiveRepository = readMnemonicReceiveRepository;
        this.restClientService = restClientService;
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void schedule() {
        Long uid = readMnemonicReceiveRepository.findMaxId();
        if (uid.equals(0L)) {
            uid = receiveRepository.findMinId();
        }
        System.out.println("Scheduled Service max uid mnemonic_receive:" + uid);
        uid = uid + 1L;
        Optional<MnemonicReceiveEntity> firstReceive = receiveRepository.findByUid(uid);
        if (firstReceive.isPresent()) {
            MnemonicReceiveEntity mnemonicReceiveEntity = firstReceive.get();
            String content = mnemonicReceiveEntity.getContent();
            JSONObject json = XML.toJSONObject(content);
            if (checkMnemonicReceiveHaveConcentratorRequest(json)) {
                try {
                    QueryResult queryResult = objectMapper.readValue(content, QueryResult.class);
                    restClientService.sendToBack(queryResult);
                    readMnemonicReceiveRepository.addReadReceive(uid, "requestFromConcentrator");

                } catch (JsonProcessingException e) {
                    System.out.println(e.getMessage());
                }
            }
            if (checkMnemonicReceiveHaveTelecomRequest(json)) {
                try {
                    ClientMessage clientMessage = objectMapper.readValue(content, ClientMessage.class);
                    restClientService.sendToBackTelecomRequest(clientMessage);
                    readMnemonicReceiveRepository.addReadReceive(uid, "requestFromTelecom");
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }

            } else {
                System.out.println("uid: " + uid + " is not GetRequestRequest");
                readMnemonicReceiveRepository.addReadReceive(uid, "error");

            }
        }
    }

    private boolean checkMnemonicReceiveHaveTelecomRequest(JSONObject json) {
        if (json.has("tns:ClientMessage")) {
            return true;
        }
        return false;
    }

    private boolean checkMnemonicReceiveHaveConcentratorRequest(JSONObject json) {
        if (json.has("QueryResult")) {
            JSONObject queryResult = (JSONObject) json.get("QueryResult");
            JSONObject message = (JSONObject) queryResult.get("Message");
            if (message.has("messageType")) {
                return !message.get("messageType").equals("ErrorMessage");
            }
            return true;
        }
        return false;
    }
}

