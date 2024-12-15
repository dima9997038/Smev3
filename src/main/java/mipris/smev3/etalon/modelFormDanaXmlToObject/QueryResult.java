package mipris.smev3.etalon.modelFormDanaXmlToObject;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class QueryResult {

    public SmevMetadata getSmevMetadata() {
        return smevMetadata;
    }

    @JacksonXmlProperty(localName = "smevMetadata")
    private SmevMetadata smevMetadata;

    @JacksonXmlProperty(localName = "Message")
    private Message message;

    public void setSmevMetadata(SmevMetadata smevMetadata) {
        this.smevMetadata = smevMetadata;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    // Getters and Setters

    public static class SmevMetadata {
        @JacksonXmlProperty(localName = "MessageId")
        private String messageId;

        @JacksonXmlProperty(localName = "TransactionCode")
        private String transactionCode;

        @JacksonXmlProperty(localName = "Sender")
        private String sender;

        @JacksonXmlProperty(localName = "Recipient")
        private String recipient;

        @JacksonXmlProperty(localName = "SendingDate")
        private String sendingDate;

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }

        public String getRecipient() {
            return recipient;
        }

        public void setRecipient(String recipient) {
            this.recipient = recipient;
        }

        public String getSendingDate() {
            return sendingDate;
        }

        public void setSendingDate(String sendingDate) {
            this.sendingDate = sendingDate;
        }

        public String getMessageId() {
            return messageId;
        }

        public void setMessageId(String messageId) {
            this.messageId = messageId;
        }

        public String getTransactionCode() {
            return transactionCode;
        }

        public void setTransactionCode(String transactionCode) {
            this.transactionCode = transactionCode;
        }

        // Getters and Setters
    }
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Message {

        @JacksonXmlProperty(isAttribute = true, localName = "type")
        private String type;
        @JacksonXmlProperty(localName = "RequestMetadata")
        private RequestMetadata requestMetadata;

        @JacksonXmlProperty(localName = "RequestContent")
        private RequestContent requestContent;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public RequestMetadata getRequestMetadata() {
            return requestMetadata;
        }

        public void setRequestMetadata(RequestMetadata requestMetadata) {
            this.requestMetadata = requestMetadata;
        }

        public RequestContent getRequestContent() {
            return requestContent;
        }

        public void setRequestContent(RequestContent requestContent) {
            this.requestContent = requestContent;
        }

        // Getters and Setters

        public static class RequestMetadata {
            @JacksonXmlProperty(localName = "clientId")
            private String clientId;

            @JacksonXmlProperty(localName = "linkedGroupIdentity")
            private LinkedGroupIdentity linkedGroupIdentity;

            @JacksonXmlProperty(localName = "testMessage")
            private boolean testMessage;

            @JacksonXmlProperty(localName = "TransactionCode")
            private String transactionCode;

            public String getClientId() {
                return clientId;
            }

            public void setClientId(String clientId) {
                this.clientId = clientId;
            }

            public LinkedGroupIdentity getLinkedGroupIdentity() {
                return linkedGroupIdentity;
            }

            public void setLinkedGroupIdentity(LinkedGroupIdentity linkedGroupIdentity) {
                this.linkedGroupIdentity = linkedGroupIdentity;
            }

            public boolean isTestMessage() {
                return testMessage;
            }

            public void setTestMessage(boolean testMessage) {
                this.testMessage = testMessage;
            }

            public String getTransactionCode() {
                return transactionCode;
            }

            public void setTransactionCode(String transactionCode) {
                this.transactionCode = transactionCode;
            }

            // Getters and Setters

            public static class LinkedGroupIdentity {
                @JacksonXmlProperty(localName = "refClientId")
                private String refClientId;

                @JacksonXmlProperty(localName = "refGroupId")
                private String refGroupId;

                public String getRefClientId() {
                    return refClientId;
                }

                public void setRefClientId(String refClientId) {
                    this.refClientId = refClientId;
                }

                public String getRefGroupId() {
                    return refGroupId;
                }

                public void setRefGroupId(String refGroupId) {
                    this.refGroupId = refGroupId;
                }

                // Getters and Setters
            }
        }

        public static class RequestContent {
            @JacksonXmlProperty(localName = "content")
            private Content content;

            public Content getContent() {
                return content;
            }

            public void setContent(Content content) {
                this.content = content;
            }

            // Getters and Setters

            public static class Content {
                @JacksonXmlProperty(localName = "MessagePrimaryContent")
                private MessagePrimaryContent messagePrimaryContent;

                public MessagePrimaryContent getMessagePrimaryContent() {
                    return messagePrimaryContent;
                }

                public void setMessagePrimaryContent(MessagePrimaryContent messagePrimaryContent) {
                    this.messagePrimaryContent = messagePrimaryContent;
                }

                // Getters and Setters

                public static class MessagePrimaryContent {
                    @JacksonXmlProperty(localName = "FormData", namespace = "http://epgu.gosuslugi.ru/concentrator/huntingticket/3.1.0")
                    private FormData formData;

                    public FormData getFormData() {
                        return formData;
                    }

                    public void setFormData(FormData formData) {
                        this.formData = formData;
                    }

                    // Getters and Setters
                }
            }
        }
    }
}
