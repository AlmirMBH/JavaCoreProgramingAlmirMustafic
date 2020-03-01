package advancedJavaThree;

import java.util.ArrayList;
import java.util.List;

public class ThreeExecutor {
    public static void main(String[] args) {
        
        // Person p1 = new Person(0, "Almir", "Mustafic", LocalDate.of(1979, 12, 4)); Hard-coded
        PersonConsoleReader personConsoleReader = new PersonConsoleReader();
        List<Person> persons = new ArrayList<Person>();
        Person p = personConsoleReader.readPerson(System.in); 
        persons.add(p);
        System.out.println(p);        
    }    
}
 