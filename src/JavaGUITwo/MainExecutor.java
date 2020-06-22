package JavaGUITwo;

public class MainExecutor {
    public static void main(String[] args) {
        RunnableImplementation runnableImplementation = new RunnableImplementation();
        
        System.out.println("Pozdrav iz MAIN thread-a!: " + Thread.currentThread().getName());        
        runnableImplementation.run(); // Ova linija koda izvršava se takođe u MAIN thread-u
        new Thread(runnableImplementation).start(); // Ova linija koda izvršava se u novom thread-u "Thread-0"
        new AnotherThread().start(); // Ova linija koda izvršava se u novom thread-u "Thread-1"        
        
    }
    
}
