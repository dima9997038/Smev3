package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequestContent {

    @JacksonXmlProperty(localName = "content", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private Content content;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

}
