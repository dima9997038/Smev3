package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {

    @JacksonXmlProperty(localName = "Service", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private Service service;

    @JacksonXmlProperty(localName = "Goal", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private int goal;

    @JacksonXmlProperty(localName = "VariantChoice", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private VariantChoice variantChoice;

    @JacksonXmlProperty(localName = "DelegateInfo", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private int delegateInfo;

    @JacksonXmlProperty(localName = "RecipientPersonalData", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private RecipientPersonalData recipientPersonalData;

    @JacksonXmlProperty(localName = "CompetentOrganization", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private CompetentOrganization competentOrganization;

    @JacksonXmlProperty(localName = "ConfirmHuntMinimum", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private ConfirmHuntMinimum confirmHuntMinimum;

    @JacksonXmlProperty(localName = "PrevTicketInfo", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private PrevTicketInfo prevTicketInfo;

    @JacksonXmlProperty(localName = "AdditionalInformation", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private AdditionalInformation additionalInformation;

    @JacksonXmlElementWrapper(localName = "Documents", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    @JacksonXmlProperty(localName = "Document", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private List<Document> documents;

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal(int goal) {
        this.goal = goal;
    }

    public VariantChoice getVariantChoice() {
        return variantChoice;
    }

    public void setVariantChoice(VariantChoice variantChoice) {
        this.variantChoice = variantChoice;
    }

    public int getDelegateInfo() {
        return delegateInfo;
    }

    public void setDelegateInfo(int delegateInfo) {
        this.delegateInfo = delegateInfo;
    }

    public RecipientPersonalData getRecipientPersonalData() {
        return recipientPersonalData;
    }

    public void setRecipientPersonalData(RecipientPersonalData recipientPersonalData) {
        this.recipientPersonalData = recipientPersonalData;
    }

    public CompetentOrganization getCompetentOrganization() {
        return competentOrganization;
    }

    public void setCompetentOrganization(CompetentOrganization competentOrganization) {
        this.competentOrganization = competentOrganization;
    }

    public ConfirmHuntMinimum getConfirmHuntMinimum() {
        return confirmHuntMinimum;
    }

    public void setConfirmHuntMinimum(ConfirmHuntMinimum confirmHuntMinimum) {
        this.confirmHuntMinimum = confirmHuntMinimum;
    }

    public PrevTicketInfo getPrevTicketInfo() {
        return prevTicketInfo;
    }

    public void setPrevTicketInfo(PrevTicketInfo prevTicketInfo) {
        this.prevTicketInfo = prevTicketInfo;
    }

    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(AdditionalInformation additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}

