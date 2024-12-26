package mipris.smev3.ackResponse.dto.permitResource;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"requestMetadata", "requestContent"})
public class RequestMessage {

    @XmlElement(name = "RequestMetadata", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private RequestMetadata requestMetadata;

    @XmlElement(name = "RequestContent")
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
