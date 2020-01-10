package predavanje6one;

import predavanje6.Person;

public class SixOne {
    public static void main(String[] args) {
       Person.printCounter();       
       Person p3 = new Person("Zekerijah", "Sehic", 27);
       p3.putSomeMoneyOnAccount(1100.0);
       p3.withdrawSomeMoneyOnAccount(150);       
       double p3Balance = p3.getBalance();
       printPersonBalance(p3);
              
       Person p9 = new Person("Moamer", "Jusupović");
       p9.putSomeMoneyOnAccount(120.0);
      // printPersonBalance(p9);
              
       System.out.println("Stanje računa = " + p3Balance + " ili " + p3.getBalance());
       System.out.println("Stanje računa = " + p3.getBalance() + " " + p3.hashCode());
       
       
    }   
    static void printPersonBalance(Person p){
           System.out.println("Koliko imaš na računu? " + "Imam " + p.getBalance());
       }
    /*SixOne SixOne = new SixOne();
    SixOne.printPersonBalance(p3);
    
    void printPersonBalance(Person p){
           System.out.println("Koliko imaš na računu? " + "Imam " + p.getBalance());
       }*/
}
