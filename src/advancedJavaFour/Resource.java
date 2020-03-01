package advancedJavaFour;

import java.io.Closeable;
import java.io.IOException;

public class Resource implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("Ovu funkciju ce pozvati Java");
    }
    
}
