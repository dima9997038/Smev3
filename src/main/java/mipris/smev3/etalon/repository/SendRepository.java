package mipris.smev3.etalon.repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class SendRepository {
    public void sendRequestToDb(String request) {
        try (Connection connection = ConnectionManager.open();
             Statement statement = connection.createStatement()) {
            statement.executeUpdate(request);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Long findMaxId() {


        String query = "SELECT MAX(uid) FROM public.mnemonic_send;";
        try (Connection connection = ConnectionManager.open();
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Long id = Long.valueOf(resultSet.getString("max"));
                statement.close();
                connection.close();
                return id;
            } else return 0L;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
