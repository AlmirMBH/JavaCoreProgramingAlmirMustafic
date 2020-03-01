package advancedJavaSeven;

public class NumberContainerExecutor {
    public static void main(String[] args) {
        NaturalNumberContainer container = new NaturalNumberContainer();
        container.add(23);
        container.add(32);
        container.add(13);
        
        for(Integer number : container){ // Za enhanced petlju objekat (container) mora biti tipa iterable 
            System.out.println(number);  // parametriziran tipom objekata Integer          
        }
    }
    
}
