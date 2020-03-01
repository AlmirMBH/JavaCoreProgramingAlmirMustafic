package ZadaciTima;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class KreiranjeIPisanjeUFajl1 {    

    static void upisiUPrviFajl() {
        int SIZE = 10;
        List<String> names;
        names = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            names.add("OsobaX " + i);            
        }

        try (FileWriter writer = new FileWriter("Prvifajl.txt");
                PrintWriter out = new PrintWriter(writer)) {
                //for(String name: names)
                //out.println(name);
                // Može se koristiti FOR ili LAMBDA
                
                names.forEach((name) -> {
                out.println(name);
                
            });out.close();

        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
