package mipris.smev3.ackResponse.repository;

import mipris.smev3.etalon.repository.ConnectionManager;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.UUID;

@Repository
public class AckRepository {


    public void saveSend(UUID clientId, String content) {
        Long uid = findMaxId();
        String sql = "INSERT INTO public.mnemonic_send(id, content, uid) VALUES (?, ?, ?);";

        try (Connection connection = ConnectionManager.open();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)
        ) {
            preparedStatement.setString(1, clientId.toString());
            preparedStatement.setString(2, content);
            preparedStatement.setLong(3, uid + 1);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Long findMaxId() {
        String query = "SELECT MAX(public.mnemonic_send.uid) FROM public.mnemonic_send";
        try (Connection connection = ConnectionManager.open();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Long id = resultSet.getLong("max");
                return id;
            } else return 0L;
        } catch (SQLException e) {
            return 0L;
        }
    }
}
