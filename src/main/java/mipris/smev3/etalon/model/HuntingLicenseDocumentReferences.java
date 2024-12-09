package mipris.smev3.etalon.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "documentReference"})
public class HuntingLicenseDocumentReferences {

    private DocumentReference documentReference;
    public DocumentReference getDocumentReference() {
        return documentReference;
    }
    @XmlElement(name = "ns:DocumentReference")
    public void setDocumentReference(DocumentReference documentReference) {
        this.documentReference = documentReference;
    }


}
