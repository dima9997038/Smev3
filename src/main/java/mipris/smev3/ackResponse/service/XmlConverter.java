package mipris.smev3.ackResponse.service;



import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import mipris.smev3.ackResponse.dto.*;
import org.springframework.stereotype.Service;

import java.io.StringWriter;

@Service
public class XmlConverter {

    public String convertToXml(ResponseMessageDto responseMessageDto) {
        String xmlResult = null;
        AckClientMessage clientMessage = new AckClientMessage();
        clientMessage.setItSystem("231b01");
        AckResponseMessage responseMessage = new AckResponseMessage();
        AckResponseMetadata metadata = new AckResponseMetadata();
        metadata.setClientId(responseMessageDto.getResponseMessage().getResponseMetadata().getClientId());
        metadata.setReplyToClientId(responseMessageDto.getResponseMessage().getResponseMetadata().getReplyToClientId());
        AckResponseContent responseContent = new AckResponseContent();
        AckContent content = new AckContent();
        AckMessagePrimaryContent primaryContent = new AckMessagePrimaryContent();
        AckFormDataResponse formDataResponse = new AckFormDataResponse();
        formDataResponse.setOktmo(responseMessageDto.getResponseMessage().getResponseContent().getContent().getMessagePrimaryContent().getFormDataResponse().getOktmo());
        AckChangeOrderInfo changeOrderInfo = new AckChangeOrderInfo();
        AckOrderId orderId = new AckOrderId();
        orderId.setPguId(responseMessageDto.getResponseMessage().getResponseContent().getContent().getMessagePrimaryContent().getFormDataResponse().getChangeOrderInfo().getOrderId().getPguId());
        AckStatusCode statusCode = new AckStatusCode();
        statusCode.setTechCode(responseMessageDto.getResponseMessage().getResponseContent().getContent().getMessagePrimaryContent().getFormDataResponse().getChangeOrderInfo().getStatusCode().getTechCode());
        changeOrderInfo.setOrderId(orderId);
        changeOrderInfo.setStatusCode(statusCode);
        changeOrderInfo.setComment(responseMessageDto.getResponseMessage().getResponseContent().getContent().getMessagePrimaryContent().getFormDataResponse().getChangeOrderInfo().getComment());
        formDataResponse.setChangeOrderInfo(changeOrderInfo);
        primaryContent.setFormDataResponse(formDataResponse);
        content.setMessagePrimaryContent(primaryContent);
        responseContent.setContent(content);
        responseMessage.setResponseMetadata(metadata);
        responseMessage.setResponseContent(responseContent);
        clientMessage.setResponseMessage(responseMessage);

        JAXBContext context = null;
        try {
            context = JAXBContext.newInstance(AckClientMessage.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter writer = new StringWriter();
            marshaller.marshal(clientMessage, writer);
            xmlResult=writer.toString();


        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }


        return xmlResult;
    }
}

