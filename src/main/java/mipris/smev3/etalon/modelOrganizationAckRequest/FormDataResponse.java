package mipris.smev3.etalon.modelOrganizationAckRequest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class FormDataResponse {
    private String  oktmo;
    private String xmlns;
    private ChangeOrderInfo changeOrderInfo;

    @XmlElement(name = "ns:changeOrderInfo")
    public ChangeOrderInfo getChangeOrderInfo() {
        return changeOrderInfo;
    }

    public void setChangeOrderInfo(ChangeOrderInfo changeOrderInfo) {
        this.changeOrderInfo = changeOrderInfo;
    }

    @XmlAttribute
    public String getOktmo() {
        return oktmo;
    }
    @XmlAttribute(name = "xmlns:ns")
    public String getXmlns() {
        return xmlns;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }
}
