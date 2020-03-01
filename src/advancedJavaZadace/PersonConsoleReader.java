package advancedJavaZadace;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class PersonConsoleReader {
    
    public static void readPersons(){
        ArrayList<String> names = new ArrayList<>(); 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite Vaše ime!");
        
        while(!scanner.hasNextInt()){
            System.out.println("Unesite sljedeće ime!");
            String name;
            if(scanner.hasNextLine()){
                name = scanner.nextLine();
                names.add(name);
                
                
            }
        }
        System.out.println("Unijeli ste numeričku vrijednost!");
    }
    
    static void printCollections(Collection<String> names){
        for(String name : names){
            System.out.println("Name = " + name);
        }
        
    }
}

