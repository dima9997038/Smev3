package mipris.smev3.ackResponse.dto.permitResource;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class RequestContent {

    @XmlElement(name = "content")
    private Content content;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }
}
