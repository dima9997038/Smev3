package mipris.smev3.etalon.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"code","name","description"})

public class DocumentReference {
    private String code;
    private String name;
    private String description;

    public String getCode() {
        return code;
    }
    @XmlElement(name = "ns:Code")
    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }
    @XmlElement(name = "ns:Name")
    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    @XmlElement(name = "ns:Description")
    public void setDescription(String description) {
        this.description = description;
    }
}
