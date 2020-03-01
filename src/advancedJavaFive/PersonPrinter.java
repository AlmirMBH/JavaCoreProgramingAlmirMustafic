package advancedJavaFive;

import java.util.Collections;
import java.util.List;

public class PersonPrinter{
    private final List<Person> persons;

    public PersonPrinter(List<Person> persons) {
        this.persons = persons;
    }
    public void printPersons(){
        for(int i = 0; i<persons.size(); i++){
            Person person = persons.get(i);
            System.out.println(person);
        }
    }
    
    public void printPersons1(){
        for(Person p : persons){            
            System.out.println(p);    
        }
    }
    
    public void printPersons2(){
        persons.forEach((p) -> {
            System.out.println(p);
        });
}
    public void printPersonsWithSpecificName(String name){ // Ukoliko želimo specifično ime, moramo ga proslijediti funkciji
        for(Person p : persons){            
            boolean condition = p.getFirstName().equals(name);
                if(condition){
                    System.out.println(p);
                }
        }
    }
    public void printPersonsWithSpecificSurname(String surname){ 
        for(Person p1 : persons){            
            boolean condition = p1.getLastName().equals(surname);
                if(condition){
                    System.out.println(p1);
                }
        }
    }
    
    public void printPersonOrderByName(){
        Collections.sort(persons);
        for(Person person : persons){
            System.out.println(person);
        }
    }
    
    public void printPersonAfterTesting(PersonTester personTester){
        for(Person p : persons){
            if(personTester.test(p)){
                System.out.println(p);   
            }
            
        }
        
    }

    void printPersonsFromCity(String zenica) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}