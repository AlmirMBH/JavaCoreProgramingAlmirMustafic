package predavanje4;

import javax.swing.JOptionPane;

public class StringSwitch {
        public static void main(String[] args) {
        String weekName = JOptionPane.showInputDialog("Unesi ime mjeseca");
        
        switch(weekName.toLowerCase()){
            case "monday":
                System.out.println("Unio si ponedjeljak!");
                break;
            case "tuesday":
                System.out.println("Unio si utorak!");
                break;
            case "wednesday":
                System.out.println("Unio si srijeda!");
                break;
            case "thursday":
                System.out.println("Unio si četvrtak!");
                break;
        }
    }
}
