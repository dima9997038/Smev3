package mipris.smev3.ackResponse.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ResponseMessageTelecomDto {
    @JsonProperty("ResponseMessage")
    private ResponseMessage responseMessage;

    public ResponseMessage getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(ResponseMessage responseMessage) {
        this.responseMessage = responseMessage;
    }

    public static class ResponseMessage {

        @JsonProperty("ResponseMetadata")
        private ResponseMetadata responseMetadata;

        @JsonProperty("ResponseContent")
        private ResponseContent responseContent;

        public ResponseMetadata getResponseMetadata() {
            return responseMetadata;
        }

        public void setResponseMetadata(ResponseMetadata responseMetadata) {
            this.responseMetadata = responseMetadata;
        }

        public ResponseContent getResponseContent() {
            return responseContent;
        }

        public void setResponseContent(ResponseContent responseContent) {
            this.responseContent = responseContent;
        }
    }

    public static class ResponseMetadata {

        @JsonProperty("clientId")
        private String clientId;

        @JsonProperty("replyToClientId")
        private String replyToClientId;

        public String getClientId() {
            return clientId;
        }

        public void setClientId(String clientId) {
            this.clientId = clientId;
        }

        public String getReplyToClientId() {
            return replyToClientId;
        }

        public void setReplyToClientId(String replyToClientId) {
            this.replyToClientId = replyToClientId;
        }
    }

    public static class ResponseContent {

        @JsonProperty("content")
        private Content content;

        public Content getContent() {
            return content;
        }

        public void setContent(Content content) {
            this.content = content;
        }
    }

    public static class Content {

        @JsonProperty("MessagePrimaryContent")
        private MessagePrimaryContent messagePrimaryContent;

        public MessagePrimaryContent getMessagePrimaryContent() {
            return messagePrimaryContent;
        }

        public void setMessagePrimaryContent(MessagePrimaryContent messagePrimaryContent) {
            this.messagePrimaryContent = messagePrimaryContent;
        }
    }

    public static class MessagePrimaryContent {

        @JsonProperty("FormResponse")
        private FormResponse formResponse;

        public MessagePrimaryContent(FormResponse formResponse) {
            this.formResponse = formResponse;
        }

        public FormResponse getFormResponse() {
            return formResponse;
        }

        public void setFormResponse(FormResponse formDataResponse) {
            this.formResponse = formResponse;
        }
    }

    public static class FormResponse {

        public String getXmlnsNs() {
            return xmlnsNs;
        }

        public void setXmlnsNs(String xmlnsNs) {
            this.xmlnsNs = xmlnsNs;
        }

        @JsonProperty("xmlns:tns")
        private String xmlnsNs;

        @JsonProperty("changeOrderInfo")
        private ChangeOrderInfo changeOrderInfo;

        public ChangeOrderInfo getChangeOrderInfo() {
            return changeOrderInfo;
        }

        public void setChangeOrderInfo(ChangeOrderInfo changeOrderInfo) {
            this.changeOrderInfo = changeOrderInfo;
        }
    }

    public static class ChangeOrderInfo {

        @JsonProperty("orderId")
        private OrderId orderId;

        @JsonProperty("statusCode")
        private StatusCode statusCode;

        @JsonProperty("comment")
        private String comment;

        public OrderId getOrderId() {
            return orderId;
        }

        public void setOrderId(OrderId orderId) {
            this.orderId = orderId;
        }

        public StatusCode getStatusCode() {
            return statusCode;
        }

        public void setStatusCode(StatusCode statusCode) {
            this.statusCode = statusCode;
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }
    }

    public static class OrderId {

        @JsonProperty("pguId")
        private String pguId;

        public String getPguId() {
            return pguId;
        }

        public void setPguId(String pguId) {
            this.pguId = pguId;
        }
    }

    public static class StatusCode {

        @JsonProperty("techCode")
        private String techCode;

        public String getTechCode() {
            return techCode;
        }

        public void setTechCode(String techCode) {
            this.techCode = techCode;
        }
    }
}
