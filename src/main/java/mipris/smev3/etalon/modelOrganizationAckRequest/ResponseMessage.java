package mipris.smev3.etalon.modelOrganizationAckRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "typ:ResponseMessage")
@XmlType(propOrder = {"responseMetadata", "responseContent"})
public class ResponseMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    private ResponseMetadata responseMetadata;
    private ResponseContent responseContent;

    @XmlElement(name = "typ:ResponseMetadata")
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }
    @XmlElement(name = "typ:ResponseContent")
    public ResponseContent getResponseContent() {
        return responseContent;
    }

    public void setResponseContent(ResponseContent responseContent) {
        this.responseContent = responseContent;
    }
}
