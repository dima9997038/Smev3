package mipris.smev3.ackResponse.dto.permitResource;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import mipris.smev3.ackResponse.dto.ResponseMessageTelecomDto;

@XmlAccessorType(XmlAccessType.FIELD)
public class AckFormResponse {
//    @XmlAttribute(name = "oktmo")
//    private String oktmo;
//
//    @XmlElement(name = "ns:changeOrderInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
//    private String xmlnsNs;

    @XmlElement(name = "ns:changeOrderInfo")
    private ChangeOrderInfo changeOrderInfo;

   public static class ChangeOrderInfo{

   }
}
