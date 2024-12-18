package mipris.smev3.ackResponse.dto;

import jakarta.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class AckMessagePrimaryContent {

    @XmlElement(name = "ns:FormDataResponse", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private AckFormDataResponse formDataResponse;

    public AckFormDataResponse getFormDataResponse() {
        return formDataResponse;
    }

    public void setFormDataResponse(AckFormDataResponse formDataResponse) {
        this.formDataResponse = formDataResponse;
    }
}

