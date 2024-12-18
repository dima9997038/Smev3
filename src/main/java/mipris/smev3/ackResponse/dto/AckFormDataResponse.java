package mipris.smev3.ackResponse.dto;
import jakarta.xml.bind.annotation.*;


@XmlAccessorType(XmlAccessType.FIELD)
public class AckFormDataResponse {
    @XmlAttribute(name = "oktmo")
    private String oktmo;

    @XmlElement(name = "ns:changeOrderInfo", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private AckChangeOrderInfo changeOrderInfo;

    public String getOktmo() {
        return oktmo;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }

    public AckChangeOrderInfo getChangeOrderInfo() {
        return changeOrderInfo;
    }

    public void setChangeOrderInfo(AckChangeOrderInfo changeOrderInfo) {
        this.changeOrderInfo = changeOrderInfo;
    }
}
