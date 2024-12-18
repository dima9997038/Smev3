package mipris.smev3.ackResponse.dto;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AckOrderId {
    @XmlElement(name = "ns:pguId", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private String pguId;

    public String getPguId() {
        return pguId;
    }

    public void setPguId(String pguId) {
        this.pguId = pguId;
    }
}
