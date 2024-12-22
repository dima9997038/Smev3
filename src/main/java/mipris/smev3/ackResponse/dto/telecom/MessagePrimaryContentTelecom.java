package mipris.smev3.ackResponse.dto.telecom;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessagePrimaryContentTelecom {
    @JsonProperty("FormResponse")
    private FormResponseTelecom formResponse;
}
