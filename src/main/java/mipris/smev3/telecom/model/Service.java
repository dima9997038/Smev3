package mipris.smev3.telecom.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Service {

    @JacksonXmlProperty(localName = "currentDate", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String currentDate;

    @JacksonXmlProperty(localName = "userType", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String userType;

    @JacksonXmlProperty(localName = "orderId", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private int orderId;

    @JacksonXmlProperty(localName = "orderStatusCode", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String orderStatusCode;

    @JacksonXmlProperty(localName = "orgBrief", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private boolean orgBrief;

    @JacksonXmlProperty(localName = "TargetId", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String targetId;

    @JacksonXmlProperty(localName = "TargetName", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String targetName;

    @JacksonXmlProperty(localName = "DepartmentId", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String departmentId;

    @JacksonXmlProperty(localName = "DepartmentName", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String departmentName;

    @JacksonXmlProperty(localName = "okato", namespace = "urn://rostelekom.ru/HuntingTicket/1.0.2")
    private String okato;

    public String getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderStatusCode() {
        return orderStatusCode;
    }

    public void setOrderStatusCode(String orderStatusCode) {
        this.orderStatusCode = orderStatusCode;
    }

    public boolean isOrgBrief() {
        return orgBrief;
    }

    public void setOrgBrief(boolean orgBrief) {
        this.orgBrief = orgBrief;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getOkato() {
        return okato;
    }

    public void setOkato(String okato) {
        this.okato = okato;
    }
}
