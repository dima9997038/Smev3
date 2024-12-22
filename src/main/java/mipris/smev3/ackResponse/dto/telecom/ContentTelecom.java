package mipris.smev3.ackResponse.dto.telecom;

import com.fasterxml.jackson.annotation.JsonProperty;
import mipris.smev3.ackResponse.dto.ResponseMessageTelecomDto;

public class ContentTelecom {
    @JsonProperty("MessagePrimaryContent")
    private MessagePrimaryContentTelecom messagePrimaryContent;
}
