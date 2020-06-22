package JavaGUITwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class ProzorZaGeekPanel {
    
 private final JPanel panel;

    public ProzorZaGeekPanel(JPanel panel) {
        this.panel = panel;
    }
    
    public void show(){
        JFrame frame = new JFrame("Button demonstration");
        frame.add(panel);
        frame.setSize(1200, 200);
        //frame.pack();           // Automatsko podešavanje dimenzija okvira u odnosu na dodati sadržaj koji dodajemo
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        JPanel panel = new ButtonPanel();
        panel = new GeekPanel();
        ProzorZaGeekPanel prozor = new ProzorZaGeekPanel(panel);
        Runnable runProzor = () -> prozor.show(); // ILI = prozor::show;
        SwingUtilities.invokeLater(runProzor);
    }
    
}
