package JavaGUITwo;
// NEOPHODNE STVARI ZA KREIRANJE GRAFIČKOG INTERFEJSA U SWING-U
// 1) JFrame -> prozor koji ima okno sa sadržajem -> content pane
// 2) Kontrole -> JButton, JTextField, JComponent...
// 3) LayoutManager -> slaganje komponenti

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ProzorTester {

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        // Runnable runnable = new RunnableImplementation();
        // Runnable runnable1 = () -> createAndShowGUI(); // LAMBDA i funkcija CREATEANDSHOWGUI nam omogućavaju da 
        // izbjegnemo statičku klasu RUNNABLEIMPLEMENTATION (ispood)

        // Runnable runnable2 = ProzorTester::createAndShowGUI; // Ali ukoliko LAMBDA samo poziva metodu, moguće je
                                                            // koristiti metod referenciranja "::"
        ProzorTester prozorTester = new ProzorTester();
        Runnable runnable3 = () -> prozorTester.createAndShowGUIFromObjectMethod(); // Poziv objektne metode
        

        SwingUtilities.invokeLater(runnable3); // Prikaz prozora u drugom thread-u
        // EventQueue.invokeLater(runnable); // Jedan od načina poziva JFrame
        // new Thread(runnable).start(); // Poziv JFrame može i na ovaj način, ali su INVOKELATER bolje opcije                
    }

    private static void createAndShowGUI() {
        System.out.println(Thread.currentThread().getName());
        JFrame frame = new JFrame("Menu bar");
        frame.setSize(700, 200);
        frame.setVisible(true);
    }
    
    private void createAndShowGUIFromObjectMethod(){
        System.out.println(Thread.currentThread().getName());
        JFrame frame = new JFrame("Menu bar");
        frame.setSize(700, 200);
        frame.setVisible(true);
    }

    /*static class RunnableImplementation implements Runnable{

                @Override
                public void run() {
                JFrame frame = new JFrame("Menu bar");
                frame.setSize(700, 200);
                frame.setVisible(true);
                }
            }*/
}

// java.awt.EventQueue.invokeLater(new Runnable() { // Umjesto u metodi RUN, JFrame je mogao raditi i ovoj metodi ili
//  public void run() {                       // u MAIN metodi, ali bi se ove 2 linije koda morale izbrisati 
// međutim, to nije dobra praksa

