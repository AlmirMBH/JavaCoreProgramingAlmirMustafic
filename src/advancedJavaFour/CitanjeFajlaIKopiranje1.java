package advancedJavaFour;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;
// Čitanje fajla, kreiranje drugog fajla i ispisivanje tog sadržaja u novokreirani fajl (efikasnija metoda od one u ZADATAK)
public class CitanjeFajlaIKopiranje1 {

    public static void main(String[] args) throws Exception {
        InputStream systemInputStream = System.in;

        try (InputStream inputStream = new FileInputStream("Almir.txt"); // Unutar 'RESOURCE' mogu se kreirati samo 'Closeable' objekti
                Scanner scanner = new Scanner(inputStream);
                Resource resource = new Resource();
                Writer writer = new FileWriter("Output.txt");
                PrintWriter out = new PrintWriter(writer);) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                out.println(line);
            }
        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }

    static void upisiUDrugiFajl(String content) {

        try (FileWriter fileWriter = new FileWriter("Output.txt");
                PrintWriter out = new PrintWriter(fileWriter);) {
            out.println(content);

        } catch (Exception exception) {
            System.err.println(exception.getLocalizedMessage());
        }
    }
}
