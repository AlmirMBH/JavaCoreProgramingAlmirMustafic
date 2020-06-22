package JavaGUIFour;

import javax.swing.ImageIcon;
import JavaGUIThree.two.ImageIconLoader;

public class ImageIconUtil {
    public static ImageIcon loadImageIcon(Class clazz, String fileName){
        ImageIconLoader iconLoader = new ImageIconLoader(clazz);
        ImageIcon imageIcon = iconLoader.loadImageIcon(fileName);
        return imageIcon;
    }
}
