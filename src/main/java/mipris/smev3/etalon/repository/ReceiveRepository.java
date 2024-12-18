package mipris.smev3.etalon.repository;

import mipris.smev3.etalon.entity.MnemonicReceiveEntity;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ReceiveRepository {
    public Long findMinId() {


        String query = "SELECT MIN(uid) FROM public.mnemonic_receive;";
        try (Connection connection = ConnectionManager.open();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Long id = Long.valueOf(resultSet.getString("min"));
                statement.close();
                resultSet.close();
                return id;
            } else return 0L;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Optional<MnemonicReceiveEntity> findByUid(Long uid) {
        MnemonicReceiveEntity mnemonicReceiveEntity = new MnemonicReceiveEntity();
        String query = "SELECT * FROM public.mnemonic_receive where uid = " + uid;
        try (Connection connection = ConnectionManager.open();
             Statement statement = connection.createStatement()
        ) {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Long uidFromBD = Long.valueOf(resultSet.getString("uid"));
                UUID id = UUID.fromString(resultSet.getString("id"));
                UUID refId = UUID.fromString(resultSet.getString("ref_id"));
                UUID refGroupId = null;
                if (resultSet.getString("ref_group_id") != null) {
                    refGroupId = UUID.fromString(resultSet.getString("ref_group_id"));
                }
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
