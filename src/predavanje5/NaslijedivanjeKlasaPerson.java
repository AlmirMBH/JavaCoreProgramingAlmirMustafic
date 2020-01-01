package predavanje5;

public class NaslijedivanjeKlasaPerson {
    private static int counter = 0;    
    public int age;
    protected String name;
    protected String surname;
    private double balance = 0.0;

    public NaslijedivanjeKlasaPerson(String ime, String prezime) {
        this(ime, prezime, 0);    
}
    //OVERLOAD po broju parametara ili PREKLAPANJE
    public NaslijedivanjeKlasaPerson(String name1, String surname1, int age) {
        this.name = name1;
        this.surname = surname1;
        this.age = age;
        counter++;
    }
    //OVERLOAD po tipu parametara ili PREKLAPANJE
    public NaslijedivanjeKlasaPerson(String name, double balance) {
        this.name = name;
        this.balance = balance;
        counter++;
    }
    public NaslijedivanjeKlasaPerson(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
}
    public static void printCounter() {
        System.out.println("Counter = " + counter);
    }

    public void putSomeMoneyOnAccount(double money) {
        balance = balance + money;
    }

    public void withdrawSomeMoneyOnAccount(double money) {
        balance = balance - money;
    }

    public void changeBalanceState(double money) {
        changeBalanceState(money, false);
    }

    public void changeBalanceState(double money, boolean increase){
        if(increase){
            balance = balance + money;
        }else{
            balance = balance - money;
        }
    }

    public void changeBalanceState() {
        balance = balance - 2.3;
    }

    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public String dohvatiPrezime() {
        return surname;
    }
    public static void main(String[] args) {
     NaslijedivanjeKlasaPerson p1 = new NaslijedivanjeKlasaPerson("Almir", "Mustafić");
        System.out.println(p1.name + " " + p1.surname);// Almir Mustafić
        NaslijedivanjeKlasaPerson.printCounter();// 1
        
    NaslijedivanjeKlasaPerson p2 = new NaslijedivanjeKlasaPerson("Adnan", "Husika");
        System.out.println(p2.name + " " + p2.surname);// Adnan Husika    
        NaslijedivanjeKlasaPerson.printCounter();
        
    NaslijedivanjeKlasaPerson p4 = new NaslijedivanjeKlasaPerson("Amela", "Kurtic", 17);
        System.out.println(p4.name + " " + p4.surname + " " +p4.age);// Adnan Husika
    
    NaslijedivanjeKlasaPerson p5 = new NaslijedivanjeKlasaPerson("Alema", 1000.0);
        System.out.println("ALEMA PREZIME = " + p5.surname);//Ispis je NULL za neinstancirane nizove
        
        
     
        
     p1.putSomeMoneyOnAccount(1350.0);
     p1.withdrawSomeMoneyOnAccount(150.0);
   
}
    void printPersonBalance(NaslijedivanjeKlasaPerson p) {
        System.out.println("Kolko imaš love = " + p.getBalance());
}
}