package mipris.smev3.etalon.modelClientSendRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "series","number", "issuerDate","issuerName"})
public class HuntingLicenseDocData {
    private String series;
    private String number;
    private String issuerDate;
    private String issuerName;
    @XmlElement(name = "ns:Number")
    public void setNumber(String number) {
        this.number = number;
    }
    @XmlElement(name = "ns:IssuerDate")
    public void setIssuerDate(String issuerDate) {
        this.issuerDate = issuerDate;
    }
    @XmlElement(name = "ns:IssuerName")
    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }
    @XmlElement(name = "ns:Series")
    public void setSeries(String series) {
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public String getNumber() {
        return number;
    }

    public String getIssuerDate() {
        return issuerDate;
    }

    public String getIssuerName() {
        return issuerName;
    }
}
