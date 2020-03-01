package advancedJavaSix.Book;

import advancedJavaSix.Dao; 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// DAO - Data Access Object
public class BookDAO implements Dao<Book> {

    // Dependency Injection
    private final Connection connection;

    public BookDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Book entity) { // objekat ENTITY nosi sve vrijednosti
        String sqlInsertStatement
                = "INSERT INTO Book('id', 'title', 'description', 'authorName', 'publisherName', 'publishingDate') VALUES(?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sqlInsertStatement)) {
            ps.setInt(1, entity.getId());
            ps.setString(2, entity.getTitle());
            ps.setString(3, entity.getDescription());
            ps.setString(4, entity.getAuthorName());
            ps.setString(5, entity.getPublisherName());
            //ps.setString(5, entity.getPublishingDate());
            ps.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Book get(long id) {
        String selectQuery = "SELECT * FROM book WHERE id = ?";
        // iZRAZI - SQL, Statement, PreparedStatement
        try (PreparedStatement ps = connection.prepareStatement(selectQuery)) {
            ResultSet rs = ps.executeQuery(selectQuery);
            ps.setLong(1, id);
            Book book = new Book(
                    rs.getInt(1),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getString("authorName"),
                    rs.getString("publisherName"),
                    rs.getDate(6));
            return book;
        } catch (SQLException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public List<Book> getAll() {
            String sqlStatement = "SELECT * FROM Book LMIT 100";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement);
             // gornja ILI ova linija koda: Statement statement = connection.createStatement()
             ResultSet resultSet = preparedStatement.executeQuery(sqlStatement);) // Ne mora se u zagradama pisati sqlStatement jer je već dodan u prepared statement iznad
            {          
                List<Book> books = new ArrayList<>(); // Parametrizirani objekat
                while(resultSet.next()){
                    Integer id = resultSet.getInt("id"); // može se pisati i broj kolone Integer id = resultSet.getInt(1);
                    String title = resultSet.getString("title");
                    Book book = new Book(
                        id, 
                        title, 
                        resultSet.getString("description"), 
                        resultSet.getString("authorName"), 
                        resultSet.getString(5), 
                        resultSet.getDate("publishingDate"));
                    books.add(book);
                }
                return books;                        
            } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }        
    }

    @Override
    public void update(Book entity, String... params) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Book entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
