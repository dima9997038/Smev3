package mipris.smev3.ackResponse.dto;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AckContent {
    @XmlElement(name = "typ:MessagePrimaryContent", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private AckMessagePrimaryContent messagePrimaryContent;

    public AckMessagePrimaryContent getMessagePrimaryContent() {
        return messagePrimaryContent;
    }

    public void setMessagePrimaryContent(AckMessagePrimaryContent messagePrimaryContent) {
        this.messagePrimaryContent = messagePrimaryContent;
    }
}
