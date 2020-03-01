package advancedJavaTwo;

import predavanje7.Shape;

public class BoxUser {
    public static void main(String[] args) {
        Box prvaKutija = new Box();
        prvaKutija.setObject("String");
        String prvoPolje = (String)prvaKutija.getObject();
        
        Box drugaKutija = new Box();
        drugaKutija.setObject(234);
        Integer drugoPolje = (Integer)drugaKutija.getObject();
        
        Box<String> trecaKutija = new Box<String>();
        trecaKutija.setObject("String1");
        trecaKutija.getObject();
        
        Box<Shape> cetvrtaKutija = new Box<>();
        Shape rectangle = new Shape(23, 45);
        cetvrtaKutija.setObject(rectangle);
        cetvrtaKutija.getObject();
    }
    
}
