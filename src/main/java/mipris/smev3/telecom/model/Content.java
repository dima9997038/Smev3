package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Content {

    @JacksonXmlProperty(localName = "MessagePrimaryContent", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private MessagePrimaryContent messagePrimaryContent;
    @JacksonXmlProperty(localName = "AttachmentHeaderList", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private AttachmentHeaderList attachmentHeaderList;

    public MessagePrimaryContent getMessagePrimaryContent() {
        return messagePrimaryContent;
    }

    public void setMessagePrimaryContent(MessagePrimaryContent messagePrimaryContent) {
        this.messagePrimaryContent = messagePrimaryContent;
    }


}
