package predavanje6;


import static predavanje6.Person.counter;



    //   MODIFIKATORI VIDLJIVOSTI; Može se odnositi na klase, polja
    //1) PUBLIC - javno dostupno svima; 
    //2) BEZ KLJUČNE RIJEČI - paketno privatna vidljivost
    //3) PROTECTED - povezan sa naslijeđivanjem klasa; slično kao i paketno privatna, ali je malo šira tj. ima veći opseg
    //4) PRIVATE - dostupnost samo unutar blok koda unutar kojeg je definisrana; mogu mu pristupiti samo funkcije, metode i konstruktori

public class AssignValueToPerson{ //OUTER klasa(šablon po kojem se kreiraju objekti, instance ili varijable)
                                                 // Može biti samo "public" ili "bez ključne riječi"   
    public static void main(String[] args) {        
        
       Person p1 = new Person("Almir", "Mustafic"); //Konstruktor je Person(); konstruiše tj. zauzima memoriju po šablonu klase kad kreira objekat
       p1.name = "Almir"; // Nakon što se napravi konstruktor "Person" sa parametrima u outer klasi "Person", ovaj dio koda se ne mora više pisati
       p1.surname = "Mustafic";
       p1.age = 40;
       //p1.balance = 100_000.50;
       System.out.println(Person.counter +". " + p1.name + " " + p1.surname);// "Person" u zagradi ne mora biti napisan; može se pisati "p1.counter"
             Person.printCounter();
       Person p2 = new Person("Nadira", "Puskar");       
       System.out.println(p2.counter + ". " + p2.name + " " + p2.surname);
              
       Person p5 = new Person("Moamer", "Jusupovic");       
       System.out.println(p5.counter + ". " + p5.name + " " + p5.surname);       
       System.out.println("COUNTER = " + p1.counter); //Broj koji ispisuje COUNTER zavisi od broja pozivanja konstruktora tj. od broja ispisa imena
       
       Person p6 = new Person("Elma", "Mujic", 21);
       System.out.println(p6.counter + ". " + p6.name + " " + p6.surname + " " + p6.age);
       
       Person p7 = new Person("Dzana", 1000.0);
       //System.out.println(p7.counter + ". " + p7.name + " " + p7.balance);    
       
       Person p8 = new Person("Adnan", 38); // Ukoliko držimo CTRL i mišem kliknemo na PERSON, otići ćemo u onaj konstruktor koji je naslijeđen
       System.out.println(p8.counter + ". " + p8.name + " " + p8.age);
       }
     public static void printCounter(){ 
        // VOID - ne izvršava nikakvu operaciju; vraća rezultat izvršavanja koda
            System.out.println("Counter = " + counter);
        }
    }

