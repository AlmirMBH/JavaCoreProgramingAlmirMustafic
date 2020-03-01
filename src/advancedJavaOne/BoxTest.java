package advancedJavaOne;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Kolekcije i dinamički nizovi su klase

public class BoxTest {
    public static void main(String[] args) {
        Box <Integer> mojaKutija = new Box<>(23);
        Box<String> necijaKutija = new Box<>("Kutija");
        Box<Double> plavaKutija = new Box<>(23.32);
        Box almir = new Box(LocalDate.now()); //Sirovi tip podatka
        LocalDate now = LocalDate.now();
        Box<LocalDate> trecaKutija = new Box<>(now);
        
        Person[] persons = new Person[4];
        Person almir1 = new Person("Almir", LocalDate.of(1979, Month.MARCH, 1), Gender.MALE);
        persons[2] = new Person("Moamer", LocalDate.of(1988, Month.APRIL, 1), Gender.MALE);
        persons[3] = new Person("Zekerijah", LocalDate.of(1990, Month.JUNE, 1), Gender.MALE);
        
        System.out.println(java.util.Arrays.toString(persons));
        
                    
        //List<Person> personArrayList = new ArrayList<>(); I ova opcija je moguća umjesto "ArrayList..."
        ArrayList<Person> personArrayList = new ArrayList<>(); //Dinamički niz ili kolekcija; "List" je interface
        personArrayList.add(almir1); // Član niza deklarisan iznad
        personArrayList.add(new Person("Samer", LocalDate.of(1990, Month.JUNE, 1), Gender.MALE));
        boolean minel = personArrayList.add(new Person("Minel", LocalDate.of(1991, Month.AUGUST, 1), Gender.MALE));
                        
            System.out.println(java.util.Arrays.toString(persons));
        }
    }
    

