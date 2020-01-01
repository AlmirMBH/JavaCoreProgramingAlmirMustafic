package predavanje5;

import java.util.Scanner;

public class ContinueWithLabelWordSearch {
    public static void main(String[] args) {
       System.out.println("Unesite riječ");
       String rijec = new Scanner(System.in).nextLine();
       String recenica = "Ovu recenicu skenirat cemo kako bi nasli unesenu rijec ili uneseno slovo.";
       
       int duzinaRecenice = recenica.length();
       int duzinaRijeci = rijec.length();
       int max = duzinaRecenice-duzinaRijeci;   
       //int max = recenica.length() - rijec.length();
       
       boolean foundIt = false;
       LABEL: 
            for (int i = 0; i < max; i++){
            int brojac = i;
            for(int j = 0; j < rijec.length(); j++){
               char recenicaSlovo = recenica.charAt(brojac); //Moglo je u zagradi da bude samo "++i" ili "i + j"; ali ne i "i++"
            brojac++;
                char rijecSlovo = rijec.charAt(j);
                //int counter = 0;
                //if (rijecSlovo != recenicaSlovo){ // Obrnuti logiku ovog koda (!= da bude ==)
                // counter++;}
                //if(counter == rijec.length()){ break LABEL}; 
                
                if (rijecSlovo != recenicaSlovo){ 
                continue LABEL;
       }
                
            }
                foundIt = true;// Kod obrnute logike se ovaj dio koda briše
                break; // Kod obrnute logike se ovaj dio koda briše
       }               
        System.out.println(foundIt ? "Pronašao sam" : "Nisam pronašao");
    }    
}
