package mipris.smev3.ackResponse.dto.permitResource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"ResponseMetadata", "ResponseContent"})
public class ResponseMessage {
    @XmlElement(name = "ResponseMetadata", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private ResponseMetadata responseMetadata;

    @XmlElement(name = "ResponseContent")
    private ResponseContent responseContent;

    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    public ResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(ResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
