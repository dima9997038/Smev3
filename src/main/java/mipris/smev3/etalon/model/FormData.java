package mipris.smev3.etalon.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlRootElement(name = "ns:FormData")
@XmlType(propOrder = {"orderId", "servicesType", "organization", "bookId", "applicationDetails"})
public class FormData implements Serializable {


    private static final long serialVersionUID = 1L;
    private String oktmo;
    private String xmlns;
    private Integer orderId;
    private Organization organization;
    private String servicesType;
    private String bookId;
    private ApplicationDetails applicationDetails;

    @XmlAttribute(name = "xmlns:ns")
    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }
    @XmlElement(name = "ns:bookId")
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @XmlElement(name = "ns:Organization")
    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @XmlElement(name = "ns:orderId")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @XmlAttribute
    public String getOktmo() {
        return oktmo;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }
    @XmlElement(name = "ns:ServicesType")
    public String getServicesType() {
        return servicesType;
    }

    public void setServicesType(String servicesType) {
        this.servicesType = servicesType;
    }
    @XmlElement(name = "ns:ApplicationDetails")
    public ApplicationDetails getApplicationDetails() {
        return applicationDetails;
    }

    public void setApplicationDetails(ApplicationDetails applicationDetails) {
        this.applicationDetails = applicationDetails;
    }

}
