package mipris.smev3.etalon.repository;

import org.springframework.stereotype.Repository;

import java.sql.*;

@Repository
public class ReadMnemonicReceiveRepository {
    public Long findMaxId() {
        String query = "SELECT MAX(public.read_app_mnemonic_receive.mnemonic_receive_id) FROM public.read_app_mnemonic_receive\n" +
                "\tinner join public.mnemonic_receive on public.read_app_mnemonic_receive.mnemonic_receive_id=public.mnemonic_receive.uid";
        try {
            Connection connection = ConnectionManager.open();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()) {
                Long id = resultSet.getLong("max");
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
