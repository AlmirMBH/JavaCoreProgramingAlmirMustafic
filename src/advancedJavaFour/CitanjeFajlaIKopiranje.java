package advancedJavaFour;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.lineSeparator;
import java.util.Scanner;

public class CitanjeFajlaIKopiranje {

    public static void main(String[] args) throws Exception {
        InputStream systemInputStream = System.in;
        
        try (InputStream inputStream = new FileInputStream("Almir.txt"); // Unutar 'RESOURCE' mogu se kreirati samo 'Closeable' objekti
            Scanner scanner = new Scanner(inputStream)) {
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String lineSeparator = System.lineSeparator();
                sb.append(line+lineSeparator());
                
                String content = sb.toString();
                upisiUDrugiFajl(content);
            }
        } catch (Exception ex) {
            System.err.println(ex.getLocalizedMessage());
        }
    }

    static void upisiUDrugiFajl(String content) {
        
        try(FileWriter fileWriter = new FileWriter("Output.txt");
            PrintWriter out = new PrintWriter(fileWriter);){
            out.println(content);
            
        }catch(Exception exception){
            System.err.println(exception.getLocalizedMessage());
        }
    }
}
