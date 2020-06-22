package JavaGUITwo;
// Poziv prozora iz MAIN metode ili preko EventQueue
import java.awt.Event;
import java.awt.EventQueue;
import javax.swing.JFrame;

public class ProzorTesterFour {

    public static void main(String[] args) {
        
            // Poziv iz MAIN metode           
               JFrame frame = new JFrame("Menu bar");
                frame.setSize(700, 200);
                frame.setVisible(true);
             
        
            // Poziv iz drugog thread-a (EventQueue)
         java.awt.EventQueue.invokeLater(new Runnable() {
             @Override
             public void run() {
                JFrame frame = new JFrame("Menu bar");
                frame.setSize(700, 200);
                frame.setVisible(true);
             }
         });  
} 
}

        