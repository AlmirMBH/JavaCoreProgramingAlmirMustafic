package advancedJavaOne;

public class Box<T> {
    private T polje;

    public Box(T polje) {
        this.polje = polje;
    }

    public T getPolje() {
        return polje;
    }

    public void setPolje(T polje) {
        this.polje = polje;
    }    
}
