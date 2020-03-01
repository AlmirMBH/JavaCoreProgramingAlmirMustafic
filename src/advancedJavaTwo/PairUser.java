package advancedJavaTwo;

import java.util.List;
import predavanje6.Person;

public class PairUser {
    public static void main(String[] args) throws Exception{
        Integer kljuc = 0;
        Person vrijednost = new Person("Almir", "Mustafic");
        
        Pair<Integer, Person> pair1 = new OrderedPair<>(kljuc, vrijednost); // Kreiranje objekta "pair1" je zavisno od INTEGER i PERSON
        Person p = pair1.getValue(); // null
        String personName = p.getName(); // null.getName();
        System.out.println(personName);
        System.out.println(p.getName());
        
        String vrijednost1 = "2";
        Integer number = Integer.parseInt(vrijednost1); // Može biti zamjena za generički tip
        
        Pair<Person, Person> pair2 = new OrderedPair<>(new Person("Brad", "Pit"), new Person("Pit", "Sampras")); // Unbounded
        Double kljuc1 = 1.0;
        Pair<Double, Person> pair3 = new UnorderedPair<>(kljuc1, new Person("Angelina", "Jolie"));
        Pair<Integer, Person> pair4 = new UnorderedPair<>(kljuc, new Person("Brad", "Pit"));
        
        //EQUALS uvijek treba override-ati u paru sa HashCode
        Person p1 = new Person("Almir", "Bešlagić");
        Person p2 = new Person("Almir", "Bešlagić");
        boolean equality = Util.compare(p1, p2);
        System.out.println(equality);
        
    
    }
}
