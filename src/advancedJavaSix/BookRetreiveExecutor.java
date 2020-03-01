package advancedJavaSix;

import advancedJavaSix.Book.Book;
import advancedJavaSix.Book.BookDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookRetreiveExecutor {
    public static void main(String[] args) {
        // BAD PRACTICE -> Koristit će se connection pool
        try(Connection connection = DriverManager.getConnection(ConnectionEnum.URL.get(), ConnectionEnum.USERNAME.get(), ConnectionEnum.PASSWORD.get())){
            BookDAO bookDAO = new BookDAO(connection);
            Book singleBook = bookDAO.get(2);
            System.out.println(singleBook);
        }catch(SQLException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
    
}
