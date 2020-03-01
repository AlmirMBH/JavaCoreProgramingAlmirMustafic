package ZadaciTima;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class KopiranjeIUpisivanje {

    

    static void kopiranjeTexta() throws IOException {

        try (InputStream input1 = new FileInputStream("Prvifajl.txt");
                InputStream input2 = new FileInputStream("Drugifajl.txt");
                Scanner scanner1 = new Scanner(input1);
                Scanner scanner2 = new Scanner(input2);) {
            StringBuilder sb = new StringBuilder();
            
            while (scanner1.hasNextLine()) {
                String line1 = scanner1.nextLine();
                sb.append(line1).append(System.lineSeparator());
            }

            while (scanner2.hasNextLine()) {
                String line2 = scanner2.nextLine();
                sb.append("\n").append(line2);
            }
            String content = sb.toString();
            upisivanjeKopiranogTexta(content);
        }
    }

    public static void upisivanjeKopiranogTexta(String content) {
        try (FileWriter fileWriter = new FileWriter("TreciFajl.txt");
                PrintWriter out = new PrintWriter(fileWriter)) {
            out.println(content);
            out.close();
        } catch (Exception e) {
            System.err.println(e.getLocalizedMessage());
        }
    }
}
