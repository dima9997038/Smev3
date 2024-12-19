package mipris.smev3.entity;

import java.sql.Timestamp;
import java.util.UUID;

public class MnemonicReceiveEntity {
    private Long uid;
    private UUID id;
    private UUID refId;
    private UUID refGroupId;
    private String content;
    private Timestamp created_at;


    public MnemonicReceiveEntity(Long uid, UUID id, UUID refId, UUID refGroupId, String content, Timestamp created_at) {
        this.uid = uid;
        this.id = id;
        this.refId = refId;
        this.refGroupId = refGroupId;
        this.content = content;
        this.created_at = created_at;
    }

    public MnemonicReceiveEntity() {
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getRefId() {
        return refId;
    }

    public void setRefId(UUID refId) {
        this.refId = refId;
    }

    public UUID getRefGroupId() {
        return refGroupId;
    }

    public void setRefGroupId(UUID refGroupId) {
        this.refGroupId = refGroupId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}
