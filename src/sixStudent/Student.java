package sixStudent;

import predavanje6.Person;

public class Student extends Person{ /** Klasa "Student" naslijeđuje klasu "Person",
                                        ali pritom MORA preuzeti bar jedan konstruktor klase "Person"
                                        Naslijeđivanje omogućava preuzimanje vrijednosti klasa iz drugih paketa*/    
    private int indexNumber; // Može se dodati vlastito polje u konstruktor
    public Student(String name1, String surname, int indexNumber) {
        super(name1, surname);
        this.indexNumber = indexNumber;
    }    
    public int getIndexNumber(){
        return indexNumber;
    }
    public void printStudentInfo(){
        System.out.println("Name = " + name + "; " + "Surname = " + surname + "; " + "Index number = " + indexNumber);
    }
}
