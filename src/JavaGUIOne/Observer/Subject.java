package JavaGUIOne.Observer;
// Izdavacka kuca
public interface Subject {
    
    public void registerObserver(Observer observer);
    
    public void removeObserver(Observer observer);
    
    public void notifyObservers();
}
