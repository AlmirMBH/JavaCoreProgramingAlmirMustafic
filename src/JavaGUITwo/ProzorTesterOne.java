package JavaGUITwo;
// Poziv objektne metode za JFrame upotrebom LAMBDA operatora
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ProzorTesterOne {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        ProzorTesterOne prozorTesterOne = new ProzorTesterOne();
        //Runnable runnable = () -> prozorTesterOne.createAndShowGUIFromObjectMethod();
        Runnable runnable1 = prozorTesterOne::createAndShowGUIFromObjectMethod; // može se koristti i metod referenciranja
       // prozorTesterOne.createAndShowGUIFromObjectMethod(); // Ovaj poziv je moguć, ali se poziva u MAIN Thread-u
        SwingUtilities.invokeLater(runnable1);
    }

    private void createAndShowGUIFromObjectMethod() {
        System.out.println(Thread.currentThread().getName());
        JFrame frame = new JFrame("Menu bar");
        frame.setSize(700, 200);
        frame.setVisible(true);
    }
}
