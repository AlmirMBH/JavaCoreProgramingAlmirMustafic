package JavaGUITwo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ButtonPanelTwo extends JPanel implements ActionListener{
    private final JButton leftButton;
    private final JButton middleButton;
    private final JButton rightButton;
    
    public ButtonPanelTwo(){    // U bloku koda konstruktora definisani su i dodani BUTTON-i
        // Kreiranje BUTTONS sa slikom
        ImageIconLoader iconLoader = new ImageIconLoader();        
        ImageIcon leftImageIcon = iconLoader.createImageIcon("right.png");
        
        this.leftButton = new JButton("Disable middle button", leftImageIcon); // Konstruktor JButton
        this.leftButton.setVerticalTextPosition(SwingConstants.CENTER);
        this.leftButton.setHorizontalTextPosition(SwingConstants.LEADING);
        this.leftButton.setActionCommand("DISABLE");
        this.leftButton.setMnemonic(KeyEvent.VK_D); // Upotreba je preko tastera: ALT + D 
        this.leftButton.addActionListener(this); // THIS se uvijek odnosi na objekat
        this.leftButton.setLocation(300, 200);
        
        ImageIcon middleImageIcon = iconLoader.createImageIcon("middle.png");
        
        this.middleButton = new JButton("Middle button", middleImageIcon);
        this.middleButton.setHorizontalTextPosition(SwingConstants.CENTER); 
        this.middleButton.setVerticalTextPosition(SwingConstants.BOTTOM);
         
        
        ImageIcon rightImageIcon = iconLoader.createImageIcon("left.png");
       
        this.rightButton = new JButton("Enable middle button", rightImageIcon);
        this.rightButton.setActionCommand("ENABLE");
        this.rightButton.setMnemonic(KeyEvent.VK_E); // Upotreba je preko tastera: ALT + D
        this.rightButton.addActionListener(this);        
               
        // DODAVANJE BUTTON U PANEL
        add(leftButton); // add je funkcija koju BUTTONPANEL preuzima iz JPANEL, a on iz JCOMPONENT, a ona iz CONTAINER
        add(middleButton);
        add(rightButton);
    }    

    @Override
    public void actionPerformed(ActionEvent e) {
        if("ENABLE".equals(e.getActionCommand())){
            middleButton.setEnabled(true);
          // middleButton.setVisible(true); // U kombinaciji sa linijom 67, ova linija omogućava pojavljivanje 
        }else{                             // i skrivanje middle button-a
            middleButton.setEnabled(false);
          //  middleButton.setVisible(false); // Uklanja u potpunosti button
        }
        System.out.println("Button panel koji je ujedno i Action listener");
    }
    
}
