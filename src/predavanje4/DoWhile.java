package predavanje4;

import java.util.Scanner;

public class DoWhile { //Bez obzira da li se unese broj koji je manji od 11 ili ne petlja će se izvršiti, odnosno ispisat će broj koji se unese
    public static void main(String[] args) {
        System.out.println("Unesi broj!");
        int count = new Scanner(System.in).nextInt();
        
        do{
            System.out.println("Printam count = " + count);
            count ++;
            count = count + 2;            
        }while(count<4);
    }
}
