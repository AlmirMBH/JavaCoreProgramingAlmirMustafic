package predavanje4;
    
    import java.util.Scanner;
public class While {
    public static void main(String[] args) {
        System.out.println("Unesi broj");
        int count = new Scanner(System.in).nextInt();
        
        while(count<11){
            System.out.println("Printam count = " + count);
            count++;
        }
    }
}
