package mipris.smev3.etalon.modelClientSendRequest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class House {
    private String code;
    private String value;

    @XmlAttribute
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @XmlValue
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}