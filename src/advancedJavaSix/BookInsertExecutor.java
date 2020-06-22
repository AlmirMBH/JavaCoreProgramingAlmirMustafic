package advancedJavaSix;

import advancedJavaSix.Book.Book;
import advancedJavaSix.Book.BookDAO;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;

public class BookInsertExecutor {
    
    public static void main(String[] args) throws SQLException {
        
        LocalDate publishingLocalDate = LocalDate.of(2019, Month.MARCH, 1);
        Date publishingDate = Date.valueOf(publishingLocalDate);
        Book book = new Book(
                1, 
                "Tvrdava", 
                "Nije duga", 
                "Mesa", 
                "Svjetlost",                 
                publishingDate);
        // BAD PRACTICE -> Koristit će se connection pool
        try(Connection connection = DriverManager.getConnection(ConnectionEnum.URL.get(), ConnectionEnum.USERNAME.get(), ConnectionEnum.PASSWORD.get())){
            BookDAO bookDAO = new BookDAO(connection);
            bookDAO.save(book);
        }catch(SQLException ex){
            throw new RuntimeException(ex.getMessage());
        }
        
        
    }
    
}
