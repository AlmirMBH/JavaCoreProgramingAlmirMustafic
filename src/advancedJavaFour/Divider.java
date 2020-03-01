package advancedJavaFour;

public class Divider {
    private final double number;
    
    public Divider(double number){
        this.number = number;
    }
    public double divideBy(double param) throws Exception{
        if(param<=0.0){
            throw new RuntimeException("Get lost!");
        }
        double result = this.number/param;
        return result;
    }
}
