package mipris.smev3.ackResponse.dto;

import jakarta.xml.bind.annotation.*;
@XmlAccessorType(XmlAccessType.FIELD)
public class AckResponseContent {
    public AckContent getContent() {
        return content;
    }

    public void setContent(AckContent content) {
        this.content = content;
    }

    @XmlElement(name = "typ:content", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private AckContent content;
}
