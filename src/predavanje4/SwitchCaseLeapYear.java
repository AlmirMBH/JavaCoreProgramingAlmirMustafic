
package predavanje4;

    import java.util.Scanner;
public class SwitchCaseLeapYear {
    public static void main(String[] args){
        
        Scanner nasScanner = new Scanner(System.in);        
        System.out.println("Unesi broj mjeseca!");        
        int monthNumberInput = nasScanner.nextInt();
        
        System.out.println("Unesi broj godine!");
        int yearNumberInput = nasScanner.nextInt();
                
        int daysInMonth = 0;
        
        switch(monthNumberInput){ 
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                daysInMonth = 31;                
                break;
        
            case 4: case 6: case 9: case 11:
                daysInMonth = 30;                
                break;
        
            case 2:
                if((yearNumberInput % 4 == 0 && yearNumberInput % 100 != 0) || (yearNumberInput % 400 == 0))
                    daysInMonth = 29;
                else daysInMonth = 28;
                break;
               default:
                System.out.println("Neispravan broj mjeseca!");                
        } 
        
        
        System.out.println("Broj dana u mjesecu je " + daysInMonth);
    }
}
