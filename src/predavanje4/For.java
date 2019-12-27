package predavanje4;
    import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        System.out.println("Unesi broj!");
        int count = new Scanner(System.in).nextInt();
        
        for(; count<11; count++)
            System.out.println("Printam count " + count);
        //for(int count = new Scanner(System.in).nextInt(); count<11; count++){ //I ova opcija je moguća, ali COUNT neće biti vidljivo van petlje
        //System.out.println("Printam count " + count);
        
        //BESKONAČNA PETLJA
        //for ( ; ; ){
          //  System.out.println("Ja sam u beskonačnoj petlji!");
        }
    }
}
