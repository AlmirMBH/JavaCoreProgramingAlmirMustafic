package JavaGUIFour;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import JavaGUIThree.two.ImageIconLoader;


public class AnimalActionListener implements ActionListener{
    
    private final JLabel pictureLabel;

    public AnimalActionListener(JLabel pictureLabel) {
        this.pictureLabel = pictureLabel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("EKSTERNI listener se okida pri komandi: " + e.getActionCommand());
        String fileName = e.getActionCommand();
        pictureLabel.setIcon(new JavaGUIThree.two.ImageIconLoader(AnimalPanel.class).loadImageIcon(fileName));
    } 
}
