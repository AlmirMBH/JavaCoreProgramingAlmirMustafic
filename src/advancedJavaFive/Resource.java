package advancedJavaFive;

import java.io.Closeable;
import java.io.IOException;

public class Resource implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("Poziva se blok koda Close metode");
    }
    
    public void something(){
        System.out.println("Šta se dešava?");
    }
}
