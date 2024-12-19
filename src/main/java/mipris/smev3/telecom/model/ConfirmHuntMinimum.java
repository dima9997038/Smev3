package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class ConfirmHuntMinimum {
    @JacksonXmlProperty(localName = "HuntMinimumCheck", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private boolean huntMinimumCheck;

    public boolean isHuntMinimumCheck() {
        return huntMinimumCheck;
    }

    public void setHuntMinimumCheck(boolean huntMinimumCheck) {
        this.huntMinimumCheck = huntMinimumCheck;
    }
}
