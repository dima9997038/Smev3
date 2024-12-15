package mipris.smev3.etalon.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import mipris.smev3.etalon.entity.MnemonicReceiveEntity;
import mipris.smev3.etalon.modelFormDanaXmlToObject.QueryResult;
import mipris.smev3.etalon.repository.ReadMnemonicReceiveRepository;
import mipris.smev3.etalon.repository.ReceiveRepository;
import org.json.JSONObject;
import org.json.XML;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ScheduledService {
    private final ReceiveRepository receiveRepository;
    private final ReadMnemonicReceiveRepository readMnemonicReceiveRepository;
    private final QueryResultService queryResultService;
    ObjectMapper objectMapper = new XmlMapper();
    public ScheduledService(ReceiveRepository receiveRepository, ReadMnemonicReceiveRepository readMnemonicReceiveRepository, QueryResultService queryResultService) {
        this.receiveRepository = receiveRepository;
        this.readMnemonicReceiveRepository = readMnemonicReceiveRepository;
        this.queryResultService = queryResultService;
    }

    @Scheduled(cron = "*/10 * * * * *")
    public void schedule() {
        Long uid = readMnemonicReceiveRepository.findMaxId();
        if(uid.equals(0l)){
            uid=receiveRepository.findMinId();
        }
        System.out.println("Scheduled Service max uid mnemonic_receive:" + uid);
            uid=uid+1L;
            Optional<MnemonicReceiveEntity> firstReceive = receiveRepository.findByUid(uid);
            if (firstReceive.isPresent()) {
                MnemonicReceiveEntity mnemonicReceiveEntity = firstReceive.get();
                String content = mnemonicReceiveEntity.getContent();
                JSONObject json = XML.toJSONObject(content);
               if(checkMnemonicRecieveHaveFormData(json)) {
                   try {
                       QueryResult queryResult = objectMapper.readValue(content, QueryResult.class);
                       queryResultService.sendToBack(queryResult);
                       readMnemonicReceiveRepository.addReadReceive(uid,"requestFromQueue");

                   } catch (JsonProcessingException e) {
                       System.out.println(e.getMessage());
                   }
               }else {
                   System.out.println("uid: "+uid +" is not GetRequestRequest");
                   readMnemonicReceiveRepository.addReadReceive(uid,"error");
               }
            }
    }

    private boolean checkMnemonicRecieveHaveFormData(JSONObject json) {
        JSONObject queryResult = (JSONObject) json.get("QueryResult");
        JSONObject message = (JSONObject) queryResult.get("Message");
        if(message.has("messageType")){
            return !message.get("messageType").equals("ErrorMessage");
        }
        return true;
    }
}
