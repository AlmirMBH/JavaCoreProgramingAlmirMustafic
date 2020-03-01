package sixStudent;

import java.util.Arrays;
import java.util.stream.Stream;
import predavanje6.Person;
import sixTeacher.Teacher;

public class StudentExecutor {
    public static void main(String[] args) {
        Student s1 = new Student("Almir", "Mustafic", 222);
        s1.printStudentInfo();
        
        Teacher t1 = new Teacher("Almir", "Mustafić", "Java");
        t1.printTeacherInfo();
                
        //POLIMORFIZAM - onjekti naslijeđuju 'super' klasu "Person"
        Person t2 = new Teacher("Nadira", "Puskar", "Literature"); // Novi objekat moguće je napraviti preko
        Person s2 = new Student("Samer", "Sacic", 444);            // 'super' klase "Person" 
        
        //STRING OBJEKATA               
        Person[] personArray = new Person[3]; // Članovi niza mogu biti svi oni koji naslijeđuju klasu "Person"
        personArray[0] = s2; // Object - Person - Student = trotipni objekat tj. polimorfizam
        personArray[1] = t2; // Object - Person - Teacher
        personArray[2] = new Person("Adis", "Jugo"); // Object - Person = dvotipni objekat tj. polimorfizam
        
        // C++ PETLJA
        System.out.println("C++ PETLJA");
        for(int i = 0; i<personArray.length; i++){
            Person mutant = personArray[i];
            printPersonInfo(mutant);
        }
        
        //JAVA PETLJA <= 1.7
        System.out.println("JAVA PETLJA");
        for(Person mutant : personArray){
            printPersonInfo(mutant);
        }
        
        //JAVA PETLJA >= 1.8
        System.out.println("JAVA 1.8 PETLJA");
        Arrays.asList(personArray).forEach(mutant ->printPersonInfo(mutant));
        
        
        System.out.println("JAVA 1.8 STREAM");
        Stream.of(personArray).forEach(mutant ->printPersonInfo(mutant));
        
    }
    private static void printPersonInfo(Person p){        
        System.out.println("Name = " + p.getName() + "Surname = " + p.getSurname());
        
        // I ovaj način je moguć
        String ime = p.getName();
        String prezime = p.getSurname();
        //System.out.println("Name = " + ime + "Surname = " + prezime); - Ukoliko se izvrši i ova linija koda, 
                                                                       // imena iz petlji printat će se po dva puta
    }
}
