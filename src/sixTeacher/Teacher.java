package sixTeacher;

import predavanje6.Person;

public class Teacher extends Person {

    private String scientificField;
    public Teacher(String name1, String surname, String scientificField) {
        super(name1, surname);
        this.scientificField = scientificField; 
    }
    public void printTeacherInfo(){
        System.out.println("Name = " + name + "; " + "Surname = " + surname + "; " + "Scientific field = " + scientificField);
    }
}
