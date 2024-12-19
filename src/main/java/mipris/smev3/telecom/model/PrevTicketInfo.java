package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PrevTicketInfo {
    @JacksonXmlProperty(localName = "Series", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String series;

    @JacksonXmlProperty(localName = "Number", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String number;

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
