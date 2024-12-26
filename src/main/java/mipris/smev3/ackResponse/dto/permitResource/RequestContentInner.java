package mipris.smev3.ackResponse.dto.permitResource;
import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class RequestContentInner {

    @XmlElement(name = "FormResponse", namespace = "urn://rostelekom.ru/HuntingResources/1.0.2")
    private FormData formData;

    public FormData getFormData() {
        return formData;
    }

    public void setFormData(FormData formData) {
        this.formData = formData;
    }
}
