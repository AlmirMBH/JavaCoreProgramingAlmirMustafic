package predavanje5;

import java.util.Scanner;

public class GetMatrixInteger {
    public static void main(String[] args) {
        System.out.println("Unestite broj!");
        int uneseniBroj = new Scanner(System.in).nextInt();
        
        int[][][] niz = {
            {
                {1, 3, 5, 7, 9},
                {11, 13, 15, 17, 19}, 
                {21, 23, 25, 27, 29}
            },
            {
                {31, 33, 35, 37, 39}, 
                {41, 43, 45, 47, 49}, 
                {51, 53, 55, 57, 59}
            },
            {
                {61, 63, 65, 67, 69}, 
                {71, 73, 75, 77, 79}, 
                {81, 83, 85, 87, 89}
            }
        };
        
        int i = 0; 
        int j = 0; 
        int k = 0;
        boolean foundIt = false;
        
        LABEL: for(i = 0; i<niz.length; i++){
            int[][] niz1 = niz[i];
            
            for(j = 0; j < niz1.length; j++){
                int[] var = niz1[j];
        
                for(k = 0; k < var.length; k++){
                    int var1 = var[k];
            
                    if(var1 == uneseniBroj){
                        foundIt = true;
                        break LABEL; //Indeks se neće dobro ispisivati bez LABEL
                    }        
            //System.out.print(var1 + " ");
                }
            }        
        }
       String ispis = foundIt ? "postoji" : "ne postoji";
       System.out.println("Pronašao sam uneseni broj na indeksu [" + i + "," + j + "," + k +"]" );    
    }
}


                        

               