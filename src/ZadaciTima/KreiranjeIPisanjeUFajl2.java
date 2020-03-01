package ZadaciTima;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KreiranjeIPisanjeUFajl2 {
    
    static void upisiUDrugiFajl() {  
        
        System.out.println("Unesite vaša imena u drugi niz");        
        
        Scanner korisnickiUnos = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        String line1 = null;
        
        // Ukoliko se unos želi ograničiti na npr. 5 unosa može se koristiti WHILE-FOR petlja
        /*int SIZE = 5;        
        while (korisnickiUnos.hasNextLine()) {
            for(int i = 0; i < SIZE; i++){
            names.add(line1 = korisnickiUnos.nextLine());
        }break;            
        }*/
        
        while (korisnickiUnos.hasNextLine()) {
        names.add(line1 = korisnickiUnos.nextLine());
        if(line1.equals("EXIT")){
            break;
        }
                
        try (FileWriter writer = new FileWriter("Drugifajl.txt");               
                PrintWriter out = new PrintWriter(writer)) {                
                names.forEach((name) -> {
                out.println(name);
            });
            
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
}
