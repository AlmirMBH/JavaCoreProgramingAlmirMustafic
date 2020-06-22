package JavaGUITwo;
// Upotreba LAMBDA operatora za poziv statičke metode
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


public class ProzorTesterTwo {

    public static void main(String[] args) {

        // System.out.println(Thread.currentThread().getName());        
        //  Runnable runnable1 = () -> createAndShowGUI();
        //SwingUtilities.invokeLater(runnable1);
        SwingUtilities.invokeLater(ProzorTesterTwo::createAndShowGUI); // Umjesto pisanja gornjih linija koda, moguće
                                                                      // je sve izvesti ovom linijom koda
    }

    private static void createAndShowGUI() {
        System.out.println(Thread.currentThread().getName());
        JFrame frame = new JFrame("Menu bar");
        frame.setSize(700, 200);
        frame.setVisible(true);
    }
    
    

    
}
