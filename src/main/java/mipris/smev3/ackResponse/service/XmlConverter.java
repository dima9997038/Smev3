package mipris.smev3.ackResponse.service;



import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import mipris.smev3.ackResponse.dto.*;
import mipris.smev3.ackResponse.dto.permitResource.*;
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

    public String convertTelecomToXml(ResponseMessageTelecomDto request) {
        String xmlResult = null;
        AckClientMessage clientMessage = new AckClientMessage();
        clientMessage.setItSystem("231b01");
        AckResponseMessage responseMessage = new AckResponseMessage();
        AckResponseMetadata metadata = new AckResponseMetadata();
        metadata.setClientId(request.getResponseMessage().getResponseMetadata().getClientId());
        metadata.setReplyToClientId(request.getResponseMessage().getResponseMetadata().getReplyToClientId());
        AckResponseContent responseContent = new AckResponseContent();
        AckContent content = new AckContent();
        AckMessagePrimaryContent primaryContent = new AckMessagePrimaryContent();
        AckFormDataResponse formDataResponse = new AckFormDataResponse();
//        formDataResponse.setOktmo(request.getResponseMessage().getResponseContent().getContent().getMessagePrimaryContent().getFormResponse().getOktmo());
        AckChangeOrderInfo changeOrderInfo = new AckChangeOrderInfo();
        AckOrderId orderId = new AckOrderId();
        orderId.setPguId(request.getResponseMessage().getResponseContent().getContent().getMessagePrimaryContent().getFormResponse().getChangeOrderInfo().getOrderId().getPguId());
        AckStatusCode statusCode = new AckStatusCode();
        statusCode.setTechCode(request.getResponseMessage().getResponseContent().getContent().getMessagePrimaryContent().getFormResponse().getChangeOrderInfo().getStatusCode().getTechCode());
        changeOrderInfo.setOrderId(orderId);
        changeOrderInfo.setStatusCode(statusCode);
        changeOrderInfo.setComment(request.getResponseMessage().getResponseContent().getContent().getMessagePrimaryContent().getFormResponse().getChangeOrderInfo().getComment());
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

    public String convertTelecomToXml(ResponseMessagePermitResourceDto request) {
        String xmlResult = null;

        ClientMessage clientMessage = new ClientMessage();
        clientMessage.setItSystem("231b01");

        ResponseMessage requestMessage = new ResponseMessage();
        ResponseMetadata requestMetadata = new ResponseMetadata();
        requestMetadata.setClientId(request.getResponseMessage().getResponseMetadata().getClientId());
        requestMetadata.setReplyToClientId(request.getResponseMessage().getResponseMetadata().getReplyToClientId());
        requestMessage.setResponseMetadata(requestMetadata);

        ResponseContent requestContent = new ResponseContent();
        Content content = new Content();

        MessagePrimaryContent primaryContent = new MessagePrimaryContent();

        RequestContentInner innerContent = new RequestContentInner();
        FormData formData = new FormData();
        formData.setXmlns(request.getResponseMessage().getResponseContent().getContent().getMessagePrimaryContent().getFormResponse().getXmlnsNs());

        TextRequest textRequest = new TextRequest();
        textRequest.setComment(request.getResponseMessage().getResponseContent().getContent().getMessagePrimaryContent().getFormResponse().getChangeOrderInfo().getComment());
        formData.setTextRequest(textRequest);

        innerContent.setFormData(formData);
        primaryContent.setRequestContentInner(innerContent);
        content.setMessagePrimaryContent(primaryContent);
        requestContent.setContent(content);
        requestMessage.setResponseContent(requestContent);

        clientMessage.setResponseMessage(requestMessage);
        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance(ClientMessage.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
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

