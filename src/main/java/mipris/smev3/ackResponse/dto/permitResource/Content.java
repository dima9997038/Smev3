package mipris.smev3.ackResponse.dto.permitResource;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class Content {

    @XmlElement(name = "MessagePrimaryContent")
    private MessagePrimaryContent messagePrimaryContent;

    public MessagePrimaryContent getMessagePrimaryContent() {
        return messagePrimaryContent;
    }

    public void setMessagePrimaryContent(MessagePrimaryContent messagePrimaryContent) {
        this.messagePrimaryContent = messagePrimaryContent;
    }

}
