package mipris.smev3.ackResponse.dto.telecom;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseMetadataTelecom {
    @JsonProperty("clientId")
    private String clientId;

    @JsonProperty("replyToClientId")
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
