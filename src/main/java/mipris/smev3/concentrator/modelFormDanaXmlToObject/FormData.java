package mipris.smev3.concentrator.modelFormDanaXmlToObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class FormData {

    @JacksonXmlProperty(localName = "orderId", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private String orderId;

    @JacksonXmlProperty(localName = "ServicesType", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private String servicesType;

    @JacksonXmlProperty(localName = "Organization", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private Organization organization;

    @JacksonXmlProperty(localName = "bookId", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private String bookId;

    @JacksonXmlProperty(localName = "ApplicationDetails", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
    private ApplicationDetails applicationDetails;

    @JacksonXmlProperty(isAttribute = true)
    private String oktmo;

    public String getOktmo() {
        return oktmo;
    }

    public void setOktmo(String oktmo) {
        this.oktmo = oktmo;
    }


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getServicesType() {
        return servicesType;
    }

    public void setServicesType(String servicesType) {
        this.servicesType = servicesType;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public ApplicationDetails getApplicationDetails() {
        return applicationDetails;
    }

    public void setApplicationDetails(ApplicationDetails applicationDetails) {
        this.applicationDetails = applicationDetails;
    }

    public static class Organization {
        @JacksonXmlProperty(isAttribute = true)
        private String code;
        @JacksonXmlText
        private String text;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }

    public static class ApplicationDetails {
        @JacksonXmlProperty(localName = "AddressRegistration", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
        private Address addressRegistration;

        @JacksonXmlProperty(localName = "GetLicenseAddress", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
        private Address getLicenseAddress;

        @JacksonXmlProperty(localName = "HuntingLicenseApplicant", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
        private HuntingLicenseApplicant huntingLicenseApplicant;

        @JacksonXmlProperty(localName = "HuntingLicenseDocData", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
        private HuntingLicenseDocData huntingLicenseDocData;

        @JacksonXmlElementWrapper(localName = "HuntingLicenseDocumentReferences", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
        @JacksonXmlProperty(localName = "DocumentReference", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
        private List<DocumentReference> documentReferences;

        public Address getAddressRegistration() {
            return addressRegistration;
        }

        public void setAddressRegistration(Address addressRegistration) {
            this.addressRegistration = addressRegistration;
        }

        public Address getGetLicenseAddress() {
            return getLicenseAddress;
        }

        public void setGetLicenseAddress(Address getLicenseAddress) {
            this.getLicenseAddress = getLicenseAddress;
        }

        public HuntingLicenseApplicant getHuntingLicenseApplicant() {
            return huntingLicenseApplicant;
        }

        public void setHuntingLicenseApplicant(HuntingLicenseApplicant huntingLicenseApplicant) {
            this.huntingLicenseApplicant = huntingLicenseApplicant;
        }

        public HuntingLicenseDocData getHuntingLicenseDocData() {
            return huntingLicenseDocData;
        }

        public void setHuntingLicenseDocData(HuntingLicenseDocData huntingLicenseDocData) {
            this.huntingLicenseDocData = huntingLicenseDocData;
        }

        public List<DocumentReference> getDocumentReferences() {
            return documentReferences;
        }

        public void setDocumentReferences(List<DocumentReference> documentReferences) {
            this.documentReferences = documentReferences;
        }

        public static class Address {
            @JacksonXmlProperty(localName = "FullAddress", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String fullAddress;

            @JacksonXmlProperty(localName = "Index", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String index;

            @JacksonXmlProperty(localName = "Region", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private Region region;

            @JacksonXmlProperty(localName = "Street", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private Street street;

            @JacksonXmlProperty(localName = "House", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private House house;

            @JacksonXmlProperty(localName = "Building1", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String building1;

            @JacksonXmlProperty(localName = "Apartment", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String apartment;

            public String getFullAddress() {
                return fullAddress;
            }

            public void setFullAddress(String fullAddress) {
                this.fullAddress = fullAddress;
            }

            public String getIndex() {
                return index;
            }

            public void setIndex(String index) {
                this.index = index;
            }

            public Region getRegion() {
                return region;
            }

            public void setRegion(Region region) {
                this.region = region;
            }

            public Street getStreet() {
                return street;
            }

            public void setStreet(Street street) {
                this.street = street;
            }

            public House getHouse() {
                return house;
            }

            public void setHouse(House house) {
                this.house = house;
            }

            public String getBuilding1() {
                return building1;
            }

            public void setBuilding1(String building1) {
                this.building1 = building1;
            }

            public String getApartment() {
                return apartment;
            }

            public void setApartment(String apartment) {
                this.apartment = apartment;
            }

            public static class Region {
                @JacksonXmlProperty(isAttribute = true)
                private String code;
                @JacksonXmlText
                private String text;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }
            }

            public static class Street {
                @JacksonXmlProperty(isAttribute = true)
                private String code;
                @JacksonXmlText
                private String text;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }
            }

            public static class House {
                @JacksonXmlProperty(isAttribute = true)
                private String code;

                @JacksonXmlText
                 private String text;

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getText() {
                    return text;
                }

                public void setText(String text) {
                    this.text = text;
                }
            }
        }

        public static class HuntingLicenseApplicant {
            @JacksonXmlProperty(localName = "FirstName", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String firstName;

            @JacksonXmlProperty(localName = "LastName", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String lastName;

            @JacksonXmlProperty(localName = "MiddleName", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String middleName;

            @JacksonXmlProperty(localName = "BirthDate", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String birthDate;

            @JacksonXmlProperty(localName = "Sex", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String sex;

            @JacksonXmlProperty(localName = "Email", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String email;

            @JacksonXmlProperty(localName = "Phone", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String phone;

            @JacksonXmlProperty(localName = "Snils", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String snils;

            @JacksonXmlProperty(localName = "DocSeries", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String docSeries;

            @JacksonXmlProperty(localName = "DocNumber", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String docNumber;

            @JacksonXmlProperty(localName = "DocIssuerName", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String docIssuerName;

            @JacksonXmlProperty(localName = "DocIssueDate", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String docIssueDate;

            @JacksonXmlProperty(localName = "DocIssuerDepartmentCode", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String docIssuerDepartmentCode;

            @JacksonXmlProperty(localName = "DocType", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String docType;

            @JacksonXmlProperty(localName = "BirthPlace", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String birthPlace;

            @JacksonXmlProperty(localName = "Citizenship", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String citizenship;

            @JacksonXmlProperty(localName = "BirthCountry", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String birthCountry;

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public String getSnils() {
                return snils;
            }

            public void setSnils(String snils) {
                this.snils = snils;
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

            public String getDocIssuerName() {
                return docIssuerName;
            }

            public void setDocIssuerName(String docIssuerName) {
                this.docIssuerName = docIssuerName;
            }

            public String getDocIssueDate() {
                return docIssueDate;
            }

            public void setDocIssueDate(String docIssueDate) {
                this.docIssueDate = docIssueDate;
            }

            public String getDocIssuerDepartmentCode() {
                return docIssuerDepartmentCode;
            }

            public void setDocIssuerDepartmentCode(String docIssuerDepartmentCode) {
                this.docIssuerDepartmentCode = docIssuerDepartmentCode;
            }

            public String getDocType() {
                return docType;
            }

            public void setDocType(String docType) {
                this.docType = docType;
            }

            public String getBirthPlace() {
                return birthPlace;
            }

            public void setBirthPlace(String birthPlace) {
                this.birthPlace = birthPlace;
            }

            public String getCitizenship() {
                return citizenship;
            }

            public void setCitizenship(String citizenship) {
                this.citizenship = citizenship;
            }

            public String getBirthCountry() {
                return birthCountry;
            }

            public void setBirthCountry(String birthCountry) {
                this.birthCountry = birthCountry;
            }

            public String getSex() {
                return sex;
            }

            public void setSex(String sex) {
                this.sex = sex;
            }


            public String getFirstName() {
                return firstName;
            }

            public void setFirstName(String firstName) {
                this.firstName = firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public void setLastName(String lastName) {
                this.lastName = lastName;
            }

            public String getMiddleName() {
                return middleName;
            }

            public void setMiddleName(String middleName) {
                this.middleName = middleName;
            }

            public String getBirthDate() {
                return birthDate;
            }

            public void setBirthDate(String birthDate) {
                this.birthDate = birthDate;
            }
        }

        public static class HuntingLicenseDocData {
            @JacksonXmlProperty(localName = "Series", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String series;

            @JacksonXmlProperty(localName = "Number", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String number;

            @JacksonXmlProperty(localName = "IssuerDate", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String issuerDate;

            @JacksonXmlProperty(localName = "IssuerName", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String issuerName;

            public String getIssuerName() {
                return issuerName;
            }

            public void setIssuerName(String issuerName) {
                this.issuerName = issuerName;
            }


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

            public String getIssuerDate() {
                return issuerDate;
            }

            public void setIssuerDate(String issuerDate) {
                this.issuerDate = issuerDate;
            }
        }

        public static class DocumentReference {
            @JacksonXmlProperty(localName = "Code", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String code;

            @JacksonXmlProperty(localName = "Name", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String name;

            @JacksonXmlProperty(localName = "Description", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
            private String description;
            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }



            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
