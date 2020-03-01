package advancedJavaTwo;
 // Koncepti OOP: 1) Apstrakcija, 2) Enkapsulacija, 3) Naslijeđivanje i 4) Polimorfizam
// Klase mogu imati: 1) Polja, 2) Konstruktore, 3) Metode ili Funkcije i 4) Druge klase
public class TwoExecutor {
    public static void main(String[] args) {
        
        ShadowTest shadowTest = new ShadowTest(); 
        System.out.println(shadowTest.x); // X je objektno polje objekta SHADOW
        System.out.println(ShadowTest.counter);
        System.out.println(shadowTest.counter);
        
        //Kreiranje objekta po šablonu NESTATIČKE INNER KLASE
        ShadowTest.FirstLevel firstLevelObject = shadowTest.new FirstLevel(); // Objekat firstLevel Object kreira se po šablonu OUTER klase SHADOWTEST (ShadowTest shadowTest = new ShadowTest();)
        
        //Kreiranje objekta po šablonu STATIČKE INNER KLASE
        ShadowTest.StaticFirstLevel staticLevelObject = new ShadowTest.StaticFirstLevel();
        
        //Poziv funkcije printx
        firstLevelObject.printX(23);
    }
}
