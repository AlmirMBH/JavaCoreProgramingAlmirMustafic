package predavanje5;

import java.util.Scanner;

public class ContinueLetterSearch {
    public static void main(String[] args) {
        System.out.println("Unesite neko slovo! Ako unesete riječ ili rečenicu, isprintat ću samo prvo slovo!");
        
        char unesenoSlovo = new Scanner(System.in).nextLine().charAt(0); //Uzima slovo ili prvo slovo riječi ili rečenice
        String text = "Nije svejedno jer nije svejedno!";
        
        int i;
        int brojPojavljivanja = 0;
        
        char[] nizKaraktera = text.toCharArray();
        for(i = 0; i<nizKaraktera.length; i++){
            char jednoSlovo = nizKaraktera[i];
            // Slovo "o"
            if (jednoSlovo != unesenoSlovo){
                continue;
            }
            brojPojavljivanja++;
        }
        
        System.out.println("Uneseno slovo " + unesenoSlovo + " pojavljuje se " + brojPojavljivanja + " puta.");
    }
}
