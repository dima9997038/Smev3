package mipris.smev3.concentrator.modelOrganizationAckRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"clintId","replyToClientId"})
public class ResponseMetadata {
    private ClintId clintId;
    private ReplyToClientId replyToClientId;

    @XmlElement(name = "typ:clintId")
    public ClintId getClintId() {
        return clintId;
    }

    public void setClintId(ClintId clintId) {
        this.clintId = clintId;
    }
    @XmlElement(name = "typ:replyToClientId")
    public ReplyToClientId getReplyToClientId() {
        return replyToClientId;
    }

    public void setReplyToClientId(ReplyToClientId replyToClientId) {
        this.replyToClientId = replyToClientId;
    }
}
