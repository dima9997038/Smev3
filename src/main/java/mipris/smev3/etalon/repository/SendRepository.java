package mipris.smev3.etalon.repository;

import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.Optional;
import java.util.Stack;

@Repository
public class SendRepository {
     public void sendRequestToDb(String request) {
         Connection connection = ConnectionManager.open();
         try {
             Statement statement = connection.createStatement();
             statement.executeUpdate(request);
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }
     public Long findMaxId() {

         Connection connection = ConnectionManager.open();
         String query = "SELECT MAX(uid) FROM public.mnemonic_send;";
         try {
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query);
             if (resultSet.next()) {
                 Long id = Long.valueOf(resultSet.getString("max"));
                 return id;
             } else return 0l;
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     }

}
