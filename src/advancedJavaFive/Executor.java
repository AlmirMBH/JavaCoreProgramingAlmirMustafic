package advancedJavaFive;

public class Executor {
    public static void main(String[] args) {
        
        Person person = new Person(0, "", "", "", "");
        PersonTester personTester = new PersonTester() { // Moguće je kreirati objekte funkcionalnog
            @Override                                    // interfejsa PERSONTESTEER bez operatora NEW   
            public boolean test(Person p) {              // personTester u ovom slučaju je funkcionalni interfejs
                return p.getAddress().equals("Zenica");
                        }
       };
        
        
        PersonTester personTester1 = (Person p) -> p.getAddress().equals("Zenica"); // Operator LAMBDA
        personTester.test(person);                         // Ove linije koda izvršavaju potpuno iste radnje kao i 
        personTester1.test(person);                        // gornje linije koda; može se koristiti bilo koja od njih  
        PersonTester personTester2 = (Person p) -> true;
        PersonTester personTester3 = p -> true;
        
        PersonTester personTester4 = p -> {
            boolean result = p.getCity().equals("Zenica");
            return result;
        }; 
        
    }
    
}
