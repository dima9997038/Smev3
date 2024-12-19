package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class RecipientPersonalData {

    @JacksonXmlProperty(localName = "fullfio", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String fullFio;

    @JacksonXmlProperty(localName = "lastname", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String lastName;

    @JacksonXmlProperty(localName = "firstname", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String firstName;

    @JacksonXmlProperty(localName = "middlename", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String middleName;

    @JacksonXmlProperty(localName = "dateBirth", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String dateBirth;

    @JacksonXmlProperty(localName = "birthPlace", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String birthPlace;

    @JacksonXmlProperty(localName = "DocumentPersonal", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private DocumentPersonal documentPersonal;

    @JacksonXmlProperty(localName = "citizenship", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String citizenship;

    @JacksonXmlProperty(localName = "snils", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String snils;

    @JacksonXmlProperty(localName = "Phone", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String phone;

    @JacksonXmlProperty(localName = "Email", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String email;

    @JacksonXmlProperty(localName = "RegAddressData", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String regAddressData;

    @JacksonXmlProperty(localName = "RegAddressData.fias_full_code", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String regAddressFiasFullCode;

    @JacksonXmlProperty(localName = "TemporaryAddressData", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String temporaryAddressData;

    @JacksonXmlProperty(localName = "TemporaryAddressData.fias_full_code", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String temporaryAddressFiasFullCode;

    @JacksonXmlProperty(localName = "FactAddressData", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String factAddressData;

    @JacksonXmlProperty(localName = "FactAddressData.fias_full_code", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String factAddressFiasFullCode;

    public String getFullFio() {
        return fullFio;
    }

    public void setFullFio(String fullFio) {
        this.fullFio = fullFio;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public DocumentPersonal getDocumentPersonal() {
        return documentPersonal;
    }

    public void setDocumentPersonal(DocumentPersonal documentPersonal) {
        this.documentPersonal = documentPersonal;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getSnils() {
        return snils;
    }

    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegAddressData() {
        return regAddressData;
    }

    public void setRegAddressData(String regAddressData) {
        this.regAddressData = regAddressData;
    }

    public String getRegAddressFiasFullCode() {
        return regAddressFiasFullCode;
    }

    public void setRegAddressFiasFullCode(String regAddressFiasFullCode) {
        this.regAddressFiasFullCode = regAddressFiasFullCode;
    }

    public String getTemporaryAddressData() {
        return temporaryAddressData;
    }

    public void setTemporaryAddressData(String temporaryAddressData) {
        this.temporaryAddressData = temporaryAddressData;
    }

    public String getTemporaryAddressFiasFullCode() {
        return temporaryAddressFiasFullCode;
    }

    public void setTemporaryAddressFiasFullCode(String temporaryAddressFiasFullCode) {
        this.temporaryAddressFiasFullCode = temporaryAddressFiasFullCode;
    }

    public String getFactAddressData() {
        return factAddressData;
    }

    public void setFactAddressData(String factAddressData) {
        this.factAddressData = factAddressData;
    }

    public String getFactAddressFiasFullCode() {
        return factAddressFiasFullCode;
    }

    public void setFactAddressFiasFullCode(String factAddressFiasFullCode) {
        this.factAddressFiasFullCode = factAddressFiasFullCode;
    }
}
