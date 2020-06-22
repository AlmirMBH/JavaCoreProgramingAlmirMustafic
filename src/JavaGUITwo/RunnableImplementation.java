package JavaGUITwo;
// int i = 0;
// Thread 1 --> int i = 1;

// Proces: 1) Uzimanje podatka; 2) mijenjanje vrijednosti; 3) vraćanje izmijenjenog podatka
public class RunnableImplementation implements Runnable{

    @Override
    public void run() {
        System.out.println("Pozdrav iz drugog Thread-a!: " + Thread.currentThread().getName());
    }
}