package JavaGUIOne.Observer;

import static java.awt.Color.blue;
import static java.awt.Color.green;
import static java.awt.Color.red;
import static java.awt.Color.yellow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame; // Sve što počinje sa "J" je iz swing biblioteke
import javax.swing.WindowConstants;

public class SwingObserverExecutor {
        
    private JFrame frame;    
    public void showFrame(){
        frame = new JFrame("Nas prozor");
        // Observer šablon
        // SUBJECT/Observable -> JButton objekat
        JButton brainButton = new JButton("Should I do it?");
        frame.getContentPane().add(brainButton).setBackground(blue); // Ukoliko ne napišemo getContentPane() 
        frame.getContentPane().setBackground(green);                 // poziva se samo u pozadini
        frame.setVisible(true);
        frame.setSize(1600, 200);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(3); 
                
        brainButton.addActionListener(new AngelListener()); // ActionListener - Observer
        brainButton.addActionListener(new DevilListener());
        
        JButton brainButton1 = new JButton("Should I do it now?");
        frame.getContentPane().add(brainButton1).setBackground(yellow);               
        brainButton1.setSize(200, 200);
        
        
        brainButton1.addActionListener(new AngelListener());
        brainButton1.addActionListener(new DevilListener());
        
    }

    
    
    class AngelListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it! You will regret it!");
        }
    }
    
    class DevilListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Do it!");
        }        
    }
            
    public static void main(String[] args) {
        SwingObserverExecutor example = new SwingObserverExecutor();
        example.showFrame();        
    }
}
