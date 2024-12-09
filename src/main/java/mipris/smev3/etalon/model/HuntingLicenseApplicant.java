package mipris.smev3.etalon.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"firstName","lastName","middleName","birthDate","sex","email","phone","snils","docSeries","docNumber","docIssuerName","docIssueDate","docIssuerDepartmentCode","docType","birthPlace","citizenship","birthCountry"})
public class HuntingLicenseApplicant {
    private String firstName;
    private String lastName;
    private String middleName;
    private String birthDate;
    private String sex;
    private String email;
    private String phone;
    private String snils;
    private String docSeries;
    private String docNumber;
    private String docIssuerName;
    private String docIssueDate;
    private String docIssuerDepartmentCode;
    private String docType;
    private String birthPlace;
    private String citizenship;
    private String birthCountry;


    public String getFirstName() {
        return firstName;
    }
    @XmlElement(name = "ns:FirstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @XmlElement(name = "ns:LastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
    @XmlElement(name = "ns:MiddleName")
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }
    @XmlElement(name = "ns:BirthDate")
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getSex() {
        return sex;
    }
    @XmlElement(name = "ns:Sex")
    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }
    @XmlElement(name = "ns:Email")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }
    @XmlElement(name = "ns:Phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSnils() {
        return snils;
    }
    @XmlElement(name = "ns:Snils")
    public void setSnils(String snils) {
        this.snils = snils;
    }

    public String getDocSeries() {
        return docSeries;
    }
    @XmlElement(name = "ns:DocSeries")
    public void setDocSeries(String docSeries) {
        this.docSeries = docSeries;
    }

    public String getDocNumber() {
        return docNumber;
    }
    @XmlElement(name = "ns:DocNumber")
    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocIssuerName() {
        return docIssuerName;
    }
    @XmlElement(name = "ns:DocIssuerName")
    public void setDocIssuerName(String docIssuerName) {
        this.docIssuerName = docIssuerName;
    }

    public String getDocIssueDate() {
        return docIssueDate;
    }
    @XmlElement(name = "ns:DocIssueDate")
    public void setDocIssueDate(String docIssueDate) {
        this.docIssueDate = docIssueDate;
    }

    public String getDocIssuerDepartmentCode() {
        return docIssuerDepartmentCode;
    }

    @XmlElement(name = "ns:DocIssuerDepartmentCode")
    public void setDocIssuerDepartmentCode(String docIssuerDepartmentCode) {
        this.docIssuerDepartmentCode = docIssuerDepartmentCode;
    }

    public String getDocType() {
        return docType;
    }
    @XmlElement(name = "ns:DocType")
    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getBirthPlace() {
        return birthPlace;
    }
    @XmlElement(name = "ns:BirthPlace")
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getCitizenship() {
        return citizenship;
    }
    @XmlElement(name = "ns:Citizenship")
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }

    public String getBirthCountry() {
        return birthCountry;
    }
    @XmlElement(name = "ns:BirthCountry")
    public void setBirthCountry(String birthCountry) {
        this.birthCountry = birthCountry;
    }
}
