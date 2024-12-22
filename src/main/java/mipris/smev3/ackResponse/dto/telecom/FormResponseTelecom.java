package mipris.smev3.ackResponse.dto.telecom;

import com.fasterxml.jackson.annotation.JsonProperty;
import mipris.smev3.ackResponse.dto.ResponseMessageTelecomDto;

public class FormResponseTelecom {
    @JsonProperty("oktmo")
    private String oktmo;

    @JsonProperty("xmlns:ns")
    private String xmlnsNs;

    @JsonProperty("changeOrderInfo")
    private ResponseMessageTelecomDto.ChangeOrderInfo changeOrderInfo;

    public String getOktmo() {
        return oktmo;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }

    public String getXmlnsNs() {
        return xmlnsNs;
    }

    public void setXmlnsNs(String xmlnsNs) {
        this.xmlnsNs = xmlnsNs;
    }

    public ResponseMessageTelecomDto.ChangeOrderInfo getChangeOrderInfo() {
        return changeOrderInfo;
    }

    public void setChangeOrderInfo(ResponseMessageTelecomDto.ChangeOrderInfo changeOrderInfo) {
        this.changeOrderInfo = changeOrderInfo;
    }
}
