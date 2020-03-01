package predavanje7;

public class Person1 {
    // 1. Static field ili properties
    private static int counter = 0;
    
    // 2. instancna ili objektna polja
    String name;
    private String surname;
    private int age;
    
    public Person1(String name, String surname){
        this(name, surname, 0); // Iz jednog konstruktora može se pozvati drugi
        this.name = name;
        this.surname = surname;
        counter++;
    }
    
    public Person1(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
        //counter++;
    }
    
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return surname;
    }
    
    public void printCounter(){
        System.out.println("Counter = " + counter);
    }
    
    public static void printCounter1(Person1 p){
        /*Person1 p1 = new Person1("Samer", "Saćić");*/
        System.out.println("Counter = " + counter);
       // System.out.println("Ime: " + p1.name);
    }
}
