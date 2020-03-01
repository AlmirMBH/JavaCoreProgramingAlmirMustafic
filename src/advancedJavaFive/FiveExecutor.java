package advancedJavaFive;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
// JDBC
// JDBC služi za: 
// 1) povezivanje na bazu; 
// 1.1.) dodati konektor baze nam koju se povezujemo (MY SQL JDBC Driver)
// 1.2.) Na kojoj adresi (url, username i password)
// 1.3.) Connection Driver se dobija iz DriverManager-a
// 2) slanje upita (queries) i pisanje izraza (SQL); 
// 2.1.) Statement objekat pomoću kojeg se piše SQL statement
// 2.2.) Kreirati SQL Statement
// 3) pristup i analizu podataka
// 3.1.) Izvršiti Statement
// 3.2.) Analiza preuzetih podataka

public class FiveExecutor {
    
        public static final String URL = "jdbc:mysql://localhost:3306/Java DB";
        public static final String USERNAME = "root";
        public static final String PASSWORD = "password";
        
    public static void main(String[] args) throws IOException{
        // Punjenje Liste imenima iz baze
           List<Person> persons = new ArrayList<>();
        
        // Ukoliko se koristi "try with resource" ne poziva se funkcija "close" jer je Java sama poziva
        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);){
            // DML - Data Manipulation Language (select, update, insert, delete)
            
            Statement statement = connection.createStatement();            
            String sqlstatement = "SELECT * FROM sakila.actor, sakila.address;";
            statement.execute(sqlstatement); // ova ili sljedeća linija koda može da se koristi, ali ne obje            
            ResultSet resultSet = statement.executeQuery(sqlstatement);
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String lastName = resultSet.getString("lastName");
                String firstName = resultSet.getString(3); // Može se pisati ime ili index kolone
                if(firstName.equals("Almir")){
                    String sqlUpdate = "UPDATE person.person SET  'Address' = ? WHERE id = ?";
                    PreparedStatement ps = connection.prepareStatement(sqlUpdate);
                    ps.setString(1, "Marka Marulica");
                    ps.setInt(1, 2); // 1 = Parametar; 2 = id
                    int rowNumber = ps.executeUpdate();
                    System.out.println(rowNumber);
                }
                Person person = new Person(resultSet.getInt(id), resultSet.getString("lastName"), resultSet.getString("firstName"), resultSet.getString(4), resultSet.getString(5));
                persons.add(person);
                // gornje dvije ili samo donja linija koda
                // persons.add(new Person(resultSet.getInt(id), resultSet.getString("lastName"), resultSet.getString("firstName"), resultSet.getString(4), resultSet.getString(5)));
                System.out.println(id + " " + lastName + " " + firstName);                
            }            
        }catch(SQLException sQLException){
            System.err.println(sQLException.getMessage());
        }
        
        //Resource r = new Resource();
        //r.close(); - Ove linije koda, kao i try - resource - catch dole pozivaju metodu CLOSE
         try(Resource r = new Resource()){            
        }catch(IOException e){
            System.err.println(e.getMessage());
    }
         PersonPrinter printer = new PersonPrinter(persons);
         printer.printPersons(); // Ove tri linije koda služe da pozovu tri različite
         printer.printPersons1(); // funkcije iz PersonPrinter klase, a rade potpuno
         printer.printPersons2(); // istu stvar te je zbog toga moguće koristiti samo jednu (bilo koju)
         printer.printPersonsWithSpecificName("Almir"); // ova linije poziva funkciju koja će printati samo određena imena
         printer.printPersonsWithSpecificSurname("Mustafic"); // ova linije poziva funkciju koja će printati samo određena prezimena
         printer.printPersonOrderByName(); // Printa imena osoba sortirana po abecednom redu
         printer.printPersonsFromCity("Zenica");
         
         System.out.println("LAMBDA");
         printer.printPersonAfterTesting(p->p.getCity().equals("Zenica") && p.getFirstName().equals("Almir"));
         printer.printPersonAfterTesting(it->it.getCity().equals("Tuzla"));
         
         PersonTester personTester3 = p->p.getAddress().startsWith("Trg");
         printer.printPersonAfterTesting(personTester3);
         
    }    
    
    static class MojTest implements PersonTester{

        @Override
        public boolean test(Person p) {
            return p.getCity().equals("Zenica");
        }
        
    }
}
