package mipris.smev3.ackResponse.dto.permitResource;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseMetadata {
    @XmlElement(name = "typ:clientId", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private String clientId;

    @XmlElement(name = "typ:replyToClientId", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private String replyToClientId;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getReplyToClientId() {
        return replyToClientId;
    }

    public void setReplyToClientId(String replyToClientId) {
        this.replyToClientId = replyToClientId;
    }
}