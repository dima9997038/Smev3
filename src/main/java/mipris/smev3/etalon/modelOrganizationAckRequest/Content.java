package mipris.smev3.etalon.modelOrganizationAckRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"messagePrimaryContent"})
public class Content {
    private MessagePrimaryContent messagePrimaryContent;

    @XmlElement(name = "typ:MessagePrimaryContent")
    public MessagePrimaryContent getMessagePrimaryContent() {
        return messagePrimaryContent;
    }

    public void setMessagePrimaryContent(MessagePrimaryContent messagePrimaryContent) {
        this.messagePrimaryContent = messagePrimaryContent;
    }


}
