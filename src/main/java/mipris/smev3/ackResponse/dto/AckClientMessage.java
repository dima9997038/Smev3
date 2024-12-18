package mipris.smev3.ackResponse.dto;


import jakarta.xml.bind.annotation.*;

@XmlRootElement(name = "typ:ClientMessage")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"itSystem", "responseMessage"})
public class AckClientMessage {

    @XmlElement(name = "typ:itSystem", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private String itSystem;

    @XmlElement(name = "typ:ResponseMessage", namespace = "urn://x-artefacts-smev-gov-ru/services/service-adapter/types")
    private AckResponseMessage responseMessage;


    public String getItSystem() {
        return itSystem;
    }

    public void setItSystem(String itSystem) {
        this.itSystem = itSystem;
    }


    public AckResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(AckResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }
}

