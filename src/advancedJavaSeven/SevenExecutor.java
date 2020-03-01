package advancedJavaSeven;

import advancedJavaSix.Book.Book;
import advancedJavaSix.Book.BookDAO;
import advancedJavaSix.ConnectionEnum;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

        // 1) Connection connection -> Driver Manager.getConnection();
        //    (url, username, password) Connection objekat ima objektne metode
        // 2) Statement, PreparedStatement -> dobijamo iz Connection objekta

public class SevenExecutor {
    public static void main(String[] args) {
        
        try(Connection connection = DriverManager.getConnection(ConnectionEnum.URL.get(), ConnectionEnum.USERNAME.get(), ConnectionEnum.PASSWORD.get())){
            BookDAO bookDAO = new BookDAO(connection);
            List<Book> books = bookDAO.getAll();
            BookPrinter booksPrinter = new BookPrinter(books);
            booksPrinter.printEnhancedBooks();
            
            
        }catch(SQLException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }    
}
