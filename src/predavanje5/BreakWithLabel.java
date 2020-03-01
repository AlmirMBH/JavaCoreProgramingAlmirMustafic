package predavanje5;

import java.util.Scanner;

public class BreakWithLabel {
    public static void main(String[] args) {
        System.out.println("Unesi cijeli broj!");
        int uneseniBroj = new Scanner(System.in).nextInt();
        int[][] dvodimenzionalniNiz = {
            {1, 3, 5, 7, 9},
            {11, 13, 15, 17, 19},
            {21, 23, 25, 27, 29}
        };
        boolean foundIt = false;
        int i; // Ukoliko se varijable "i" i "j" deklarišu van petlje, bit će vidljive van petlje, a onda će se moći utvrditi i indeksi unesenih brojeva
        int j = 0;
        int brojPojavljivanja = 0;
        LABEL: for(i = 0; i<dvodimenzionalniNiz.length; i++){
            int[] niz = dvodimenzionalniNiz[i];             
            for(j = 0; j<niz.length; j++){ // Skraćeni oblik pisanja j = j + 3 je j+=3
                int var = niz[j];
                if(var == uneseniBroj){
                    foundIt = true;
                    brojPojavljivanja++;
                    break LABEL;
            }            
                System.out.print(var + " ");
               // brojPojavljivanja++; // Prolazi kroz unutrasnje nizove i broji po clanovi 
        }    
            //brojPojavljivanja++; //prolazi kroz clanove matrice i broji po indexu 
            //if(foundIt){
              //  break; } - Može se koristiti "if" u ovoj poziciji umjesto label
        }
        String message = foundIt ? "Broj postoji!" : "Broj ne postoji!";
        System.out.println(message); 
        
        if(foundIt){ //Moguće je koristiti ili prethodnu ili ovu petlju
            System.out.println("Pronašao sam uneseni broj na indeksu [" + i + "," + j +"]" );
        }else{
            System.out.println("Nisam pronašao uneseni broj!");
        }
        System.out.println(brojPojavljivanja);
    }
}
