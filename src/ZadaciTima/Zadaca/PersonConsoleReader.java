package ZadaciTima.Zadaca;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class PersonConsoleReader {
    
    public static Person readPersons(){
        
        String korisnickiUnos;
        
        try(InputStream inputStream = System.in;
        Scanner personScanner = new Scanner(inputStream);){
        
        System.out.println("Unesite korisničke podatke u formatu: Ime Prezime year/month/day");               
        korisnickiUnos = personScanner.nextLine();
        
        
        String[] polja = korisnickiUnos.split(" ");
        String ime = polja[0];
        String prezime = polja[1];
        String datumRodenja = polja[2];
        
        String[] datumRodenja1 = datumRodenja.split("/");
        String yearString = datumRodenja1[0];
        int yearNumber = Integer.parseInt(yearString);
        
        String monthString = datumRodenja1[1];
        int monthNumber = Integer.parseInt(monthString);
        Month month = Month.of(monthNumber);
        
        String dayString = datumRodenja1[2];
        int day = Integer.parseInt(dayString);
        
        LocalDate birthday = LocalDate.of(yearNumber,monthNumber, day);
        Person personObject = new Person(0, ime, prezime, birthday);        
        
        return personObject; 
        
    }catch(IOException ex){
            System.out.println(ex.getLocalizedMessage());
    } 
        return null;
}
}