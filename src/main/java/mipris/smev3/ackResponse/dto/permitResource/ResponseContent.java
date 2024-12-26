package mipris.smev3.ackResponse.dto.permitResource;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import mipris.smev3.ackResponse.dto.AckContent;

@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseContent {
    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @XmlElement(name = "typ:content", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private Content content;
}