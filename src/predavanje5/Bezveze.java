package predavanje5;

import java.util.Scanner;

public class Bezveze {

    public static void main(String[] args) {
        System.out.println("Unesite broj!");
        int uneseniBroj = new Scanner(System.in).nextInt();

        int[][] numbers = {{1, 3, 5}, {7, 9, 11, 34, 55}, {7, 9, 11, 34}, {13, 15, 17, 25, 27}};

        boolean foundIt = false;

        int i;
        int j = 0;
        LABEL:
        for (i = 0; i < numbers.length; i++) {
            int[] niz = numbers[i];
            for (j = 0; j < niz.length; j++) {
                int brojUNizu = niz[j];
                if (brojUNizu == uneseniBroj) {
                    foundIt = true;
                    break LABEL;                    
                
             }
            }
        }
        if(foundIt){
            System.out.println("Našo sam na poziciji " + i + " " + j);
        }    else {System.out.println("Nisam našao");}
        
        System.out.println(foundIt ? "Broj postoji!" + "na ineksu " + i + " " + j : "Broja nema!");
        
        String ispis = foundIt ? "Uneseni broj " + uneseniBroj + " postoji na indeksu " + i + " " + j : "Broj ne postoji!";        
        System.out.println(ispis);
                
        System.out.println("Unesni broj " + uneseniBroj + " postoji na ineksu " + i + " " + j);
        }
    }
