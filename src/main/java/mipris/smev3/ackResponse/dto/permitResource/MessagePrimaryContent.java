package mipris.smev3.ackResponse.dto.permitResource;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class MessagePrimaryContent {

    @XmlElement(name = "OrganizationCode", namespace = "urn://version_table/3.0.0")
    private String organizationCode;

    @XmlElement(name = "RequestContent", namespace = "urn://version_table/3.0.0")
    private RequestContentInner requestContentInner;

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public RequestContentInner getRequestContentInner() {
        return requestContentInner;
    }

    public void setRequestContentInner(RequestContentInner requestContentInner) {
        this.requestContentInner = requestContentInner;
    }
}
