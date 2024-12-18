package mipris.smev3.ackResponse.service;

import mipris.smev3.ackResponse.dto.ResponseMessageDto;
import mipris.smev3.ackResponse.repository.AckRepository;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AckSendService {
    private final XmlConverter xmlConverter;
    private final AckRepository ackRepository;

    public AckSendService(XmlConverter xmlConverter, AckRepository ackRepository) {
        this.xmlConverter = xmlConverter;
        this.ackRepository = ackRepository;
    }

    public void writeToTableSend(ResponseMessageDto responseMessageDto) {
        String content = xmlConverter.convertToXml(responseMessageDto);
        UUID uid= UUID.fromString(responseMessageDto.getResponseMessage().getResponseMetadata().getClientId());
        ackRepository.saveSend(uid, content);
    }
}
