package JavaGUITwo;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ProzorZaButtonPanel {
    
    private final JPanel panel;

    public ProzorZaButtonPanel(JPanel panel) {
        this.panel = panel;
    }
    
    public void show(){
        JFrame frame = new JFrame("Button demonstration");
        frame.add(panel);
        frame.setSize(700, 200);
        //frame.pack();           // Automatsko podešavanje dimenzija okvira u odnosu na dodati sadržaj koji dodajemo
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        JPanel panel = new ButtonPanel();
        ProzorZaButtonPanel prozor = new ProzorZaButtonPanel(panel);
        Runnable runProzor = () -> prozor.show(); // ILI = prozor::show;
        SwingUtilities.invokeLater(runProzor);
    }
    
}
