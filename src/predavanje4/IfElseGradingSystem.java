package predavanje4;
        
    import javax.swing.JOptionPane;
    
public class IfElseGradingSystem {
    public static void main(String[] args){
        String profinaOcjena = JOptionPane.showInputDialog("Unesi broj bodova");        
           int bodovi = Integer.parseInt(profinaOcjena);        
           char grade = 0;           
            if(bodovi >=101 || bodovi < 0){ //Prvo definisati opsege brojeva koje ne želimo imati kao unos
                System.out.println("Invalid input!");
            }else if (bodovi >= 90){ //Kao uslov prvo postaviti brojeve sa najvećom vrijednosti
                grade = 'A';
           }else if (bodovi >= 80){
                grade = 'B';
           }else if (bodovi >= 70){
                grade = 'C';
           }else if (bodovi >= 60){
                grade = 'D';
           }else if (bodovi >= 50){
                grade = 'E';
           } else{   // ELSE ne dozvoljava dodavanje novih uslova
               grade = 'F';
           }             
               System.out.println(grade);
    }
    }
    
    



