package JavaGUITwo;
// Metod referenciranja "::" za poziv statičke metode iz iste klase
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ProzorTesterThree {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());        

        Runnable runnable = ProzorTesterThree::createAndShowGUI;
        new Thread(runnable).start();
        SwingUtilities.invokeLater(runnable); // Može se koristiti bilo koja od tri metode
        EventQueue.invokeLater(runnable);
    }

    private static void createAndShowGUI() {
        System.out.println(Thread.currentThread().getName());
        JFrame frame = new JFrame("Menu bar");
        frame.setSize(700, 200);
        frame.setVisible(true);
    }
    
    

    
}

