package mipris.smev3.ackResponse.dto;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AckStatusCode {
    @XmlElement(name = "ns:techCode", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private String techCode;

    public String getTechCode() {
        return techCode;
    }

    public void setTechCode(String techCode) {
        this.techCode = techCode;
    }
}
