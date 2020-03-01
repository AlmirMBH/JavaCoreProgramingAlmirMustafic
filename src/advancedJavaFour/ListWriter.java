package advancedJavaFour;
// 1) FileWriter - upisuje; sve se nalazi u "java.io" paketu;
// 2) PrintWriter - gdje upisujemo; 
// 3) Konstruktor klase FileWriter izbacuje Exception

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListWriter {

    public final static int SIZE = 10;
    private List<String> names;

    public ListWriter() {
        super();
        names = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            names.add("Person " + i);
        }
    }

    public void writeNames() {
        FileWriter writer = null;
        try {
            writer = new FileWriter("Almir.txt");
            PrintWriter out = new PrintWriter(writer);
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                /* ILI for(String name : names){out.println(name);*/
                out.print(name);
            }
        } catch (IOException ex) {
            System.err.println(ex.getLocalizedMessage());
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                System.err.println(ex.getLocalizedMessage());
            }
        }
    }
}
