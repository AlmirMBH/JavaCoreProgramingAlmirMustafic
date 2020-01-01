package predavanje5;

import java.util.Scanner;

public class WordFounderWithLabel {
    public static void main(String[] args) {
       System.out.println("Unesite riječ");
       String rijec = new Scanner(System.in).nextLine();
       String recenica = "Ovu recenicu skenirat cemo kako bi nasli unesenu rijec ili uneseno slovo.";
       
       int duzinaRecenice = recenica.length();
       int duzinaRijeci = rijec.length();
       int max = duzinaRecenice-duzinaRijeci;   
       //int max = recenica.length() - rijec.length();
       
       boolean foundIt = false;
       
            for (int i = 0; i < max; i++){
            int brojac = i;
            for(int j = 0; j < rijec.length(); j++){
               char recenicaSlovo = recenica.charAt(brojac++); //Moglo je u zagradi da bude samo "i" ili "i + j"            
                char rijecSlovo = rijec.charAt(j);
                int brojacSlova = 0;
                if (rijecSlovo == recenicaSlovo){ // Obrnuti logiku ovog koda (!= da bude ==)
                 brojacSlova++;
                }
                if(brojacSlova == (rijec.length()-1)){ 
                    break;
                    }              
       }                
            }                
       System.out.println(foundIt ? "Pronašao sam" : "Nisam pronašao");
       }               
        
    }    

