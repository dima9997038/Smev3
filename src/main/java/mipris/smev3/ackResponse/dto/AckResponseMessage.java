package mipris.smev3.ackResponse.dto;

import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"responseMetadata", "responseContent"})
public class AckResponseMessage {
    @XmlElement(name = "typ:ResponseMetadata", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private AckResponseMetadata responseMetadata;

    @XmlElement(name = "typ:ResponseContent", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private AckResponseContent responseContent;

    public AckResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(AckResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public AckResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(AckResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
