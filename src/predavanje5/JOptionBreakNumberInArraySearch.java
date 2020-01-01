package predavanje5;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JOptionBreakNumberInArraySearch {
    public static void main(String[] args) {
        //System.out.println("Unesite broj!");
        //int inputNumber = new Scanner(System.in).nextInt();
        //Scanner nasScanner = new Scanner(System.in);
        //int inputNumber = nasScanner.nextInt();
        String Broj = JOptionPane.showInputDialog("Unesite broj!");        
           int inputNumber = Integer.parseInt(Broj);
        boolean uneseniBroj = false;
        int[] niz = {1, 3, 5, 7, 9, 11, 7, 15};        
        for(int i = 0; i<niz.length; i++){
            System.out.println("Vrijednost na indexu " + i + " je " + niz[i]);
            if(niz[i] == inputNumber){
                uneseniBroj = true;
                break;
            }            
        }
        String ispis = uneseniBroj ? "Postoji" : "Ne postoji!";
            System.out.println("Broj koji ste unijeli " + ispis);
    }
    
}
