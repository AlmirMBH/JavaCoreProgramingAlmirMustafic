
package itacasovi;

import java.util.Scanner;
import javax.swing.JOptionPane;



public class Mujo {
    public static void main(String[] args) {
        
        System.out.println("Dobrodošli na naš website!");
        
        System.out.println("Unesite Vaše ime");        
        String imeKorisnika = new Scanner(System.in).nextLine();
                
        System.out.println("Unesite Vašu lozinku");        
        String sifraKorisnika = new Scanner(System.in).nextLine();
        
        
        System.out.println("Ulogujte se u Vaš profil.");        
                
        String korisnickiUnosIme;
        do{
                System.out.println("Unesite Vaše ime.");        
                korisnickiUnosIme = new Scanner(System.in).nextLine();
                              
            }while(!korisnickiUnosIme.equals(imeKorisnika));   
        
        String korisnickiUnosLozinke;
        do{
                System.out.println("Unesite Vašu lozinku.");        
            korisnickiUnosLozinke = new Scanner(System.in).nextLine();
                              
            }while(!korisnickiUnosLozinke.equals(sifraKorisnika));
        
        
        
        
        
        
        //System.out.println(imeKorisnika);
        //System.out.println(sifraKorisnika);
        
    
}
}
