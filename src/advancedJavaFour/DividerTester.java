package advancedJavaFour;

public class DividerTester {
    public static void main(String[] args) throws Exception {
        Divider divider = new Divider(100.0);
        double result = divider.divideBy(0.0);
        System.out.println(result);
        
    }
    
}
