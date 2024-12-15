package mipris.smev3.etalon.modelOrganizationAckRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"content"})
public class ResponseContent {
    private Content content;

    @XmlElement(name = "typ:content")
    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }


}
