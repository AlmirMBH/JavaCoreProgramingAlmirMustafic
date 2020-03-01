package advancedJavaTwo;

import java.util.ArrayList;
import java.util.List;

// APSTRAKTNA KLASA ima: 1) polja (objektna i statička), 2) konstruktore, 3) metode (apstraktne i konkretne) i 4) 
// INTERFACE ima: 1) polja (iako se ne napiše, ona su "public static final"), 2) funkcije (apstraktne (mora biti public abstract) i konkretne)
//Niz je složeni tip (isti tip i definisana dužina koja se ne mijenja)

//GENERIČKI TIPOVI omogućavaju strožiju provjeru tipa podatka tokom COMPILE TIME; eliminiraju eksplicitnu konverziju
//BUG-ovi: 1) Compile errors, 2) Runtime errors
public class CollectionExecutor {
    public static void main(String[] args) {
        List lista = new ArrayList(); // Sirovi (raw) tip podatka
        lista.add("Zana");
        String elementNaIndexu0 = (String)lista.get(0); //Eksplicitna konverzija u STRING
        
        List<String> lista1 = new ArrayList<>(); // Parametrizirana lista / objektni tip/ Tzv. "diamond" ne piše se STRING u obje uglaste zagrade
        lista1.add("Zana");
        String elementa1 = lista1.get(0); //Ne zahtijva eksplicitnu konverziju
        
    }
    
}
