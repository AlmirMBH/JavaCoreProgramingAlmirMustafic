package advancedJavaFour;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnector {
    public static void main(String[] args) {
        try(Connection connection = DriverManager.getConnection("dodajUrlMySQLBaze")){
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM person LIMIT 100";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()){
                String name = resultSet.getString(1); // Ime kolone ili njen redni broj
                System.out.println("");
            }
        }catch(SQLException e){
            System.err.println(e.getCause());
        }
    }
    
    

    
}
