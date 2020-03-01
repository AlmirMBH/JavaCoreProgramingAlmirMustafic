package predavanje6;
    //1. Polja, attributes, properties (1. Static; 2. Instancna ili objektna)
    //2. Konstruktor - mora biti u klasi
    //3. Funkcije ili metode (1. static; 2. objektne iliinstancne) mogu imati svečetiri modifikatora vidljivosti
    //4. Ugniježdene klase

// OUTER KLASA
public class Person {    //Ukoliko ova klasa nije "public", neće se moći naslijeđivati u drugim paketima; 
        public static int counter = 0; //1.1. Static property; dijele ga svi objekti/klase koje naslijeđuju klasu "PERSON"
        protected String name;            //1.2. Instance or object property; ukoliko stoji samo "String", "name" će biti vidljivo samo unutar paketa
        protected String surname;  //Objekat sa objektnim/instancnim poljem
        public int age;            //Objekat sa objektnim/instancnim poljem
        private double balance = 0.0;    //Objekat sa objektnim/instancnim poljem
        
// PRVI KONSTRUKTOR
        public Person(String name1, String surname){ //Parametri konstruktora u zagradi vidljivi su samo unutar konstruktora, a u prethodnoj klasi su vidljivi unutar cijele klase ili paketa
            this(name1, surname, 0); // Kod konstruktora nakon modifikatora vidljivosti odmah ide ključna riječ (ime klase), 
                        // a u zagradama dolaze parametri konstruktora 
                        //super(); - poziva objekat iz Java repozitorija
                        // Modifikatori vidljivosti mogu biti: 1) Public; 2) Bez riječi; 3) Protected; 4) Private
                        // Iz prvog konstruktora može se pozvati drugi tj. parametar iz drugog; u ovom slučaju "0" odnosno "age"
        name = name1;
        this.surname = surname; //Riječ "THIS" odnosi se na parametar u outer klasi, a dodaje se ukoliko su imena varijabli u outer klasi i konstruktoru ista
        counter++; // Inkrementacija COUNTER-a radi se unutar konstruktora kako bi povećavao vrijednost nakon
                   // svakog poziva konstruktora tj. isprintanog imena (npr. Almir Mustafić)u klasama koje preuzimaju vrijednosti ovog konstruktora
        }
// DRUGI KONSTRUKTOR         OVERLOADING - preklapanje konstruktora po broju parametara
        public Person(String name1, String surname1, int age){ //Uvijek se mora koristiti ime konstruktora Person jer se outer klasa zove Person
            this.name = name1;
            this.surname = surname1;
            this.age = age;
            counter++;            
}
// TREĆI KONSTRUKTOR    OVERLOADING/PREKLAPANJE po tipu parametara
        public Person (String name, double balance){
            this.name = name;
            this.balance = balance;
            counter++;
        }
// ČETVRTI KONSTRUKTOR       OVERLOADING - preklapanje po tipu podataka
        public Person (String name, int age){
            this.name = name;
            this.age = age;
            counter++;
}
// PETI KONSTRUKTOR       OVERLOADING - preklapanje po redoslijedu podataka
        public Person (int age, String name){
            this.age = age;
            this.name = name;
            counter++;
        }
        public static void printCounter(){ 
        // VOID - ne izvršava nikakvu operaciju; vraća rezultat izvršavanja koda
            System.out.println("Counter = " + counter);
        }
        public void putSomeMoneyOnAccount(double money){
            balance = balance + money;
        }
        public void withdrawSomeMoneyOnAccount(double money){
            balance = balance - money;
        }
        
        public void changeBalanceState(double money){
            balance = balance - 10.0;
            //changeBalanceState(money, false); //Moguće je iz jedne funkcije pozivati drugu (funkcija ispod)
        }
        
        public void changeBalanceState(double money, boolean increase){
            if(increase){
                balance = balance + money;
            } else {
                balance = balance - money;
            }
        }
        
        public void changeBalanceState(){ //Nije moguće kreirati dvije identične funkcije; prethodna sadrži parametre
            balance = balance - 2.30;
        }
        
        public double getBalance(){            
            return balance;
        }
        
        public String getName(){            
            return name;
        }
        
        public String getSurname(){            
            return surname;
        }
}
   
