package advancedJavaOne;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private String name;
    private LocalDate birthday;
    private Gender gender;

    // 1. Prosti i 2. Složeni tipovi poodataka (2.1. Složeni ili objektni i 2.2. Parametrizirani)
    // Parametrizirani tipovi postoje zahvaljujući generičkim tipovima
    public Person(String name, LocalDate birthday, Gender gender) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        Period period = birthday.until(now);
        period.getYears();
        int age = period.getYears();
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
