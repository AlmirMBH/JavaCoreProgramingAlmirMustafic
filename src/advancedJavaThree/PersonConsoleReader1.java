package advancedJavaThree;

import java.io.InputStream;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonConsoleReader1 {
    
    public List<Person> readPersons(InputStream inputStream){    
        List<Person> persons = new ArrayList<>();
        try(Scanner personScanner = new Scanner(inputStream);){
            String[] nizPolja = null;
            do{
                System.out.println("Unesite podatke u sljedećem fomratu: Ime Prezime godina/mjesec/dan");
                String korisnickiInput = personScanner.nextLine();
                nizPolja = korisnickiInput.split(" ");
                Person person = null;
                persons.add(person);
            }while(personScanner.hasNextLine() && nizPolja != null && nizPolja.length <= 3);
            
        }catch(Exception ex){
        System.err.println(ex.getLocalizedMessage());
        } 
        return persons;
    }
    
    

    public Person readPerson(InputStream inputStream) {
        try (   // InputStream inputStream = System.in; Ukoliko se InputStream ne upiše u gornju liniju koda, mora se dodati unutar TRY bloka
            Scanner personScanner = new Scanner(inputStream);) {
            System.out.println("Unesite vaše podatke u sljedećem formatu: Ime Prezime godina/mjesec/dan");
            String korisnickiUnos = personScanner.nextLine();

            String[] poljaKorisnickogUnosa = korisnickiUnos.split(" ");

            String ime = poljaKorisnickogUnosa[0];

            String prezime = poljaKorisnickogUnosa[1];

            String datumRodenja = poljaKorisnickogUnosa[2];
            String[] poljaDatumRodenja = datumRodenja.split("/");

            String godinaRodenja = poljaDatumRodenja[0];
            int godina = Integer.parseInt(godinaRodenja);

            String mjesecRodenja = poljaDatumRodenja[1];
            int mjesec = Integer.parseInt(mjesecRodenja);
            Month mjesec1 = Month.of(mjesec); // ??? Može da bude i samo prethodna linija koda (overloading po tipu)

            String danRodenja = poljaDatumRodenja[2];
            int dan = Integer.parseInt(danRodenja);

            LocalDate datumKorisnikovogRodenja = LocalDate.of(godina, mjesec1, dan);

            Person personObject = new Person(0, ime, prezime, datumKorisnikovogRodenja);
            return personObject;

        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
        return null;
    }
}
