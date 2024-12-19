package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Document {
    @JacksonXmlProperty(localName = "CodeDocument", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String codeDocument;

    @JacksonXmlProperty(localName = "Name", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String name;

    @JacksonXmlProperty(localName = "URL", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String url;

    @JacksonXmlProperty(localName = "type", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String type;

    public String getCodeDocument() {
        return codeDocument;
    }

    public void setCodeDocument(String codeDocument) {
        this.codeDocument = codeDocument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
