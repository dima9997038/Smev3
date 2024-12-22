package mipris.smev3.ackResponse.dto.telecom;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.LinkedHashMap;


public class ResponseMessageTelecom {
    @JsonProperty("ResponseContent")
    private LinkedHashMap<String,Object> responseMetadata;
    @JsonProperty("ResponseMetadata")
    private ResponseMetadataTelecom responseContent;
}
