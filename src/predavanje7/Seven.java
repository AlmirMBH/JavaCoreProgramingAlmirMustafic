package predavanje7;

public class Seven {
    public static void main(String[] args) {
        
        Person1 almirMustafic = new Person1("Almir", "Mustafić"); //Konstruktor za objektnu funkciju (ispod)        
        Seven sevenObject = new Seven();
        sevenObject.printPerson1(almirMustafic);
        
        Person1 amirMustafic = new Person1("Amir", "Mustafić"); //Konstruktor za objektnu funkciju (ispod)        
        Seven sevenObject1 = new Seven();
        sevenObject.printPerson1(amirMustafic);
        
        Person1 zekerijahSehic = new Person1("Zekerijah", "Šehić");
        printPerson(zekerijahSehic);
        Person1 moamerJusupovic = new Person1("Moamer", "Jusupović");
    }
    //STATIČKA FUNKCIJA
    static void printPerson(Person1 p){ 
        String ime = p.getName();// Ispravan način pozivanja objektnih funkcija; Ime objekta, tačka, ime funkcije
        String prezime = p.getSurname();
        
        System.out.println("Ime: " + ime + " Prezime: " + prezime);
                                 // ILI
        //System.out.println("Ime: " + p.getName() + " Prezime: " + p.getSurname()); 
        Person1.printCounter1(p); // Ispravan način pozivanja statičkih funkcija; Ime klase, tačka, ime funkcije
    }
    //OBJEKTNA FUNKCIJA
    void printPerson1(Person1 p){ // Rezultat izvršavanja ove funkcije ispisat će se prije rezultata prethodne
                                  // funkcije zbog prethodnog koda koji poziva prvo ovu funkciju
        String ime = p.getName();// Ispravan način pozivanja objektnih funkcija; Ime objekta, tačka, ime funkcije
        String prezime = p.getSurname();
        
        System.out.println("Ime: " + ime + " Prezime: " + prezime);
                                 // ILI
        //System.out.println("Ime: " + p.getName() + " Prezime: " + p.getSurname());
                
    }
}
