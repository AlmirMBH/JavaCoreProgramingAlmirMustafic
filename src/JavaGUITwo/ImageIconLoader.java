package JavaGUITwo;

import java.net.URL;
import javax.swing.ImageIcon;

public class ImageIconLoader {
        
    // Refleksija (.calss) - za svaki objekat bilo kojeg tipa u toku izvršavanja programa, Java kreira
    // tzv. CLASS OBJECT
    
    public ImageIcon createImageIcon(String name){
        URL url = ButtonPanel.class.getResource(name);
        if(url != null){
         ImageIcon icon = new ImageIcon(url);
         return icon;
        }else{
            System.out.println("Fajl po imenu " + name + " nije pronađen!");
            return null;
    } 
    }
    
}
