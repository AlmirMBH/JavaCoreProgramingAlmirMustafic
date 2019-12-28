
package predavanje4;

    import java.util.Arrays;
    import java.util.Scanner;
public class IfBreak {
    public static void main(String[] args) {
        System.out.println("Unesite broj!");
        int searchFor = new Scanner(System.in).nextInt();
        int[] numbers = {23, 34, 45, 56, 67, 78, 31, 13, 23};
        boolean foundNumber = false;
        for (int i = 0; i<numbers.length; i++){
            int vrijednost = numbers[i];
        if (searchFor == vrijednost){
            foundNumber = true;
            break;
        }
        System.out.println(vrijednost);
        }
        String message = foundNumber ? "Postoji!" : "Ne postoji!";
        System.out.println(message);        
    }    
}

       
                