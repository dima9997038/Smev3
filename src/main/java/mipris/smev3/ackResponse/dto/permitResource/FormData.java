package mipris.smev3.ackResponse.dto.permitResource;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class FormData {

    @XmlAttribute(name = "oktmo")
    private String oktmo;

    @XmlAttribute(name = "xmlns:tns")
    private String xmlns;

    @XmlElement(name = "changeOrderInfo", namespace = "urn://rostelekom.ru/HuntingResources/1.0.2")
    private TextRequest textRequest;


    public String getOktmo() {
        return oktmo;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }

    public TextRequest getTextRequest() {
        return textRequest;
    }

    public void setTextRequest(TextRequest textRequest) {
        this.textRequest = textRequest;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }
}
