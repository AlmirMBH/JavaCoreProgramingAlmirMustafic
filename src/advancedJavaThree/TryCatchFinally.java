package advancedJavaThree;

import java.util.Scanner;

// Exceptions: 1) Checked; 2) Unchecked 
public class TryCatchFinally {
    public static void main(String[] args) {
        String korisnickiUnos = "Almir Mustafic 1979/12/4";
        String[] polja = korisnickiUnos.split(" ");
        Scanner scanner = null;
        // TRY - CATCH - FINALLY
        try{
            scanner = new Scanner(System.in);
            String input = scanner.nextLine();
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }finally{
            if(scanner != null){
            scanner.close();
            } 
        }
    }
    
}
