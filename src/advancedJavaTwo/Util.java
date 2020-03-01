package advancedJavaTwo;

public class Util {
    
    // private K polje, - nije vidljivo u "public ststic <K, V>...."
    // UNBOUNDED generic type on level of function or method
    // private K; ne može jer nije na nivou klase, tek se ispod u funkciji deklariše
    
    public static<K, V> boolean compare(K value1, V value2){
        return value1.equals(value2);
    }
    // BOUNDED generic type    
    // Rezultat poređenja može biti "-1, 0, 1"; Ako je npr. 1 to znači da je prvi poređeni elemenat veći od drugog; 0 znači da su jednaki
    // K i V mogu naslijediti klasu Number ili Integer
    public static<K extends Integer, V extends Integer> int compareNumbers(K number1, V number2){
        return number1.compareTo(number2);
    }
    
}
