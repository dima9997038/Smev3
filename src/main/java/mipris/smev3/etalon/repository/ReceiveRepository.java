package mipris.smev3.etalon.repository;

import mipris.smev3.etalon.entity.MnemonicReceiveEntity;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ReceiveRepository {
    public Long findMaxId() {

        Connection connection = ConnectionManager.open();
        String query = "SELECT MAX(uid) FROM public.mnemonic_receive;";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                return Long.valueOf(resultSet.getString("max"));
            } else return 0l;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Optional<MnemonicReceiveEntity> findByUid(Long uid){
        Connection connection = ConnectionManager.open();
        MnemonicReceiveEntity mnemonicReceiveEntity = new MnemonicReceiveEntity();
        String query = "SELECT * FROM public.mnemonic_receive where uid = "+uid;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Long uidFromBD = Long.valueOf(resultSet.getString("uid"));
                UUID id = UUID.fromString(resultSet.getString("id"));
                UUID refId = UUID.fromString(resultSet.getString("ref_id"));
                UUID refGroupId = UUID.fromString(resultSet.getString("ref_group_id"));
                String content = resultSet.getString("content");
                Timestamp createdAt = resultSet.getTimestamp("created_at");
                mnemonicReceiveEntity.setId(id);
                mnemonicReceiveEntity.setContent(content);
                mnemonicReceiveEntity.setUid(uidFromBD);
                mnemonicReceiveEntity.setRefId(refId);
                mnemonicReceiveEntity.setRefGroupId(refGroupId);
                mnemonicReceiveEntity.setCreated_at(createdAt);
            } else return Optional.empty();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return Optional.of(mnemonicReceiveEntity);
    }
}
