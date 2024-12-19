package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestMessage {

    @JacksonXmlProperty(localName = "RequestMetadata", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private RequestMetadata requestMetadata;

    @JacksonXmlProperty(localName = "RequestContent", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private RequestContent requestContent;

    public RequestMetadata getRequestMetadata() {
        return requestMetadata;
    }

    public void setRequestMetadata(RequestMetadata requestMetadata) {
        this.requestMetadata = requestMetadata;
    }

    public RequestContent getRequestContent() {
        return requestContent;
    }

    public void setRequestContent(RequestContent requestContent) {
        this.requestContent = requestContent;
    }

}
