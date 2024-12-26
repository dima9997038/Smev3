package mipris.smev3.ackResponse.dto.permitResource;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class TextRequest {

//    @XmlElement(name = "orderId", namespace = "urn://rostelekom.ru/HuntingResources/1.0.2")
//    private String pguId;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @XmlElement(name = "comment", namespace = "urn://rostelekom.ru/HuntingResources/1.0.2")
    private String comment;

//    public String getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(String orderId) {
//        this.orderId = orderId;
//    }
//
//    public String getText() {
//        return text;
//    }
//
//    public void setText(String text) {
//        this.text = text;
//    }
}
