package advancedJavaTwo;
// Koncepti OOP: 1) Apstrakcija, 2) Enkapsulacija, 3) Naslijeđivanje i 4) Polimorfizam
// Klase mogu imati: 1) Polja (Objektna i Statička), 2) Konstruktore, 3) Metode ili Funkcije (Objektne i Statičke)i 4) Druge klase
//OUTER klasa može biti PUBLIC ili PAKETNO PRIVATNA
// UGNIJEŽDENE klas emogu biti OBJEKTNE I STATIČKE
public class ShadowTest {   

    public static int counter = 0;   // Staticko polje - pristupa mu se preko imena klase, tačke i counter (ShadowTest.counter)
    public int x = 0; // Objektno polje - pristupa mu se preko imena objekta, tacke i x (shadowTest.x - pogledati u TwoExecutor)
    
    public ShadowTest() {
        counter++;
    }
    
    public Object createFirstLevelObject(){ //Nije vidljiv van ove klase
        FirstLevel firstLevelObject = new FirstLevel(); // Može i FirstLevel firstLevel = this.new FirstLevel();
        return firstLevelObject; // ili samo "return new FirstLevel();" bez gornje linije koda
    }
    
    // INNER klasa može imati sve modifikatore vidljivosti
    class FirstLevel{        
        public int x = 1; // X je objektno polje klase FIRSTLEVEL
        
        public void printX(int x){ // Varijabla x ima prioritet ispisa nad ostalim "x" varijablama
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x); // riječ "this" odnosi se na polje "x" unutar klase FIRSTLEVEL
            System.out.println("ShadowTest.x = " + ShadowTest.this.x); // "x" se odnosi na polje "x" iz outer klase
        }
    }
    // STATIC INNER CLASS
    protected static class StaticFirstLevel{
        public int x = 2;
        public void printX(int x){
            System.out.println("x = " + x);
        }
    }
}

