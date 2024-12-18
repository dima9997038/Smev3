package mipris.smev3.ackResponse.dto;
import jakarta.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class AckChangeOrderInfo {
    @XmlElement(name = "ns:orderId", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private AckOrderId orderId;

    @XmlElement(name = "ns:statusCode", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private AckStatusCode statusCode;

    @XmlElement(name = "ns:comment", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private String comment;

    public AckOrderId getOrderId() {
        return orderId;
    }

    public void setOrderId(AckOrderId orderId) {
        this.orderId = orderId;
    }

    public AckStatusCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(AckStatusCode statusCode) {
        this.statusCode = statusCode;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
