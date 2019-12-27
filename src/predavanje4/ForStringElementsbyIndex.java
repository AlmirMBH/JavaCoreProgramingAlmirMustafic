package predavanje4;
    import java.util.Arrays;

public class ForStringElementsbyIndex {
    public static void main(String[] args) {
        int[] numbers = {23, 45, 56, 67, 13, 23, 21, 31, 3446};
        int i = 0;
        for( ; i<numbers.length; i++){ //Naslijeđena petlja iz C++
            System.out.println("Vrijednost na indexu " + i + " je " + numbers[i]);
        }
        
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};        
        
        for(i = 1; i<numbers1.length; i++){ //Naslijeđena petlja iz C++
            System.out.println("Vrijednost na indexu " + i + " je " + numbers1[i]);
        }
        //Enhanced loop Java //Ispisuje članove niza
        for (int ii : numbers){
            System.out.print("Član niza " + ii +", ");//Printanje u jednom redu
        } 
    }
}
