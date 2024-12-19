package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClientMessage {

    @JacksonXmlProperty(localName = "itSystem", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private String itSystem;

    @JacksonXmlProperty(localName = "RequestMessage", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private RequestMessage requestMessage;

    public String getItSystem() {
        return itSystem;
    }

    public void setItSystem(String itSystem) {
        this.itSystem = itSystem;
    }

    public RequestMessage getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(RequestMessage requestMessage) {
        this.requestMessage = requestMessage;
    }

}
