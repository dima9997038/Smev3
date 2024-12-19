package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class CompetentOrganization {

    @JacksonXmlProperty(localName = "OrganizationID", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String organizationId;

    @JacksonXmlProperty(localName = "Name", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String name;

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
