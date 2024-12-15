package mipris.smev3.etalon.repository;

import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class ReadMnemonicReceiveRepository {
    public Long findMaxId() {
        String query = "SELECT MAX(mnemonic_receive_id) FROM public.read_app_mnemonic_receive;";
        try {
            Connection connection = ConnectionManager.open();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Long id = Long.valueOf(resultSet.getString("max"));
                statement.close();
                connection.close();
                return id;
            } else return 0l;
        } catch (SQLException e) {
             return 0l;
        }
    }

    public void addReadReceive(Long mnemonicReceiveId,String messageType ) {
        try {
            Connection connection = ConnectionManager.open();
            String sql = "INSERT INTO public.read_app_mnemonic_receive(read, mnemonic_receive_id, mnemonic_send_id, message_type) VALUES ( true, ?, null, ?);";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, mnemonicReceiveId);
            preparedStatement.setString(2, messageType);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
