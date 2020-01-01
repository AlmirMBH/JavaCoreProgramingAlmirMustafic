package predavanje5;
import java.util.Scanner;
public class Boolean{
    public static void main(String[] args) {        
        System.out.println("Unesite broj!");        
        int inputNumber = new Scanner(System.in).nextInt();
        int[] niz = {1, 3, 5, 7, 9, 11, 13, 15};
        //niz[2] = 150;
        int i = 0;
        boolean uneseniBroj = false;
        for(i = 0; i<niz.length; i++){
            if(niz[i] == inputNumber){
                uneseniBroj = true;
                break;
            }
        }
        String ispis = uneseniBroj ? "postoji" : "ne postoji";
        System.out.println("Uneseni broj " + ispis + " na indeksu " + i);//Zašto uključuje 8. indeks, koji ne postoji u nizu?
        
        String x = "Kiša pada";
        String y = "Kiša ne pada";
        boolean kisa = false;
        if(x == y){
            kisa = true;}  
        System.out.println(kisa);
        
            int z = kisa ? 1 : 2; //Vrijednost "kisa" uzeta je iz prethodne petlje
            System.out.println(z);
            System.out.println(kisa ? 1 : 2); //Vrijednost "kisa" uzeta je iz prethodne petlje; boolean se može pisati u PRINT funkciji
            
            int a = 2, b = 3;
            int res = a * (b++) + b;// 2 * 3 + 4
            System.out.println(res);
        
        String text = new String("Neka vrijednost texta.");
       //String text = new String("Neka vrijednost texta.").intern(); //Mijenja ispis u TRUE
       String text1 = "Neka vrijednost texta.";
       boolean poredjenjeTexta = text == text1; // Poređenje prostih tipova tj. memorijskih prostora
       boolean poredjenjeTexta1 = text.equals(text1); // Poređenje objektnih tipova
       
       System.out.println(poredjenjeTexta);
       System.out.println(poredjenjeTexta1);
        }
    }








/*Kod za pogađanje vrijednosti članova niza korištenjem boolean-a
package predavanje5;
    import java.util.Scanner;
public class Bezveze{
    public static void main(String[] args) {
        System.out.println("Unesite broj!");
        int inputNumber = new Scanner(System.in).nextInt();
        int[] niz = {1, 3, 5, 7, 9, 11, 13};
        boolean uneseniBroj = false;
        for (int i = 0; i<niz.length; i++){
        //int vrijednost = niz[i]; **Puška je deklarisao novi INT, 
        //if(inputNumber == vrijednost) ** ali sam skontao da ovo ne mora biti u kodu; može se direktno ciljati niz[i]
        if(inputNumber == niz[i]){
        uneseniBroj = true;
        break;
        }
    }        
        String ispis = uneseniBroj ? "Ima" : "Nema";
        System.out.println(ispis);
    }
}*/

