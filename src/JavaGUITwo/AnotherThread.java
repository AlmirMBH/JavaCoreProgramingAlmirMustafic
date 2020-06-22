package JavaGUITwo;

public class AnotherThread extends Thread{

    @Override
    public void run() {
        System.out.println("Pozdrav iz drugog Thread-a!: " + Thread.currentThread().getName());
    }

    
    
    
    
}
