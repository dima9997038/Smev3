package mipris.smev3.ackResponse.dto.permitResource;

import javax.xml.bind.annotation.*;
import java.util.List;

@jakarta.xml.bind.annotation.XmlRootElement(name = "typ:ClientMessage")
@jakarta.xml.bind.annotation.XmlAccessorType(jakarta.xml.bind.annotation.XmlAccessType.FIELD)
@jakarta.xml.bind.annotation.XmlType(propOrder = {"itSystem", "responseMessage"})
public class ClientMessage {

    @XmlElement(name = "itSystem", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private String itSystem;

    @XmlElement(name = "ResponseMessage", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private ResponseMessage responseMessage;


    public String getItSystem() {
        return itSystem;
    }

    public void setItSystem(String itSystem) {
        this.itSystem = itSystem;
    }


    public ResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }
}

