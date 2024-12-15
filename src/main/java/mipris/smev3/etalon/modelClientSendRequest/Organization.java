package mipris.smev3.etalon.modelClientSendRequest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Organization {
    private String code;
    private String value;

    @Override
    public String toString() {
        return "Organization{" +
                "code='" + code + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public Organization(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public Organization() {
    }
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
