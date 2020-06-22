package ZadaciTima.Zadaca;

import java.time.LocalDate;

public class Person {
    
    private final int id;
    private final String name;
    private final String surname;
    private final LocalDate birthday;

    public Person(int id, String name, String surname, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {        
    StringBuilder sb = new StringBuilder();
    sb.append(name);
    sb.append(" ");
    sb.append(surname);
    sb.append("Birthday");
    sb.append(birthday);
    return sb.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }    
}
