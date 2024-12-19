package mipris.smev3.telecom.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DocumentPersonal {

    @JacksonXmlProperty(localName = "typeDoc", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String typeDoc;

    @JacksonXmlProperty(localName = "nameDoc", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String nameDoc;

    @JacksonXmlProperty(localName = "docseries", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String docSeries;

    @JacksonXmlProperty(localName = "docnumber", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String docNumber;

    @JacksonXmlProperty(localName = "issuedate", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String issueDate;

    @JacksonXmlProperty(localName = "issueorg", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String issueOrg;

    @JacksonXmlProperty(localName = "validate", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String validate;

    @JacksonXmlProperty(localName = "issueidPassportRF", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String issueIdPassportRF;

    public String getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(String typeDoc) {
        this.typeDoc = typeDoc;
    }

    public String getNameDoc() {
        return nameDoc;
    }

    public void setNameDoc(String nameDoc) {
        this.nameDoc = nameDoc;
    }

    public String getDocSeries() {
        return docSeries;
    }

    public void setDocSeries(String docSeries) {
        this.docSeries = docSeries;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueOrg() {
        return issueOrg;
    }

    public void setIssueOrg(String issueOrg) {
        this.issueOrg = issueOrg;
    }

    public String getValidate() {
        return validate;
    }

    public void setValidate(String validate) {
        this.validate = validate;
    }

    public String getIssueIdPassportRF() {
        return issueIdPassportRF;
    }

    public void setIssueIdPassportRF(String issueIdPassportRF) {
        this.issueIdPassportRF = issueIdPassportRF;
    }
}

