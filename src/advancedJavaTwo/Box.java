package advancedJavaTwo;

public class Box<T> { // Znat će se šta je "T" u momentu kreiranja objekta (ne može prosti tip, samo objektni) tipa BOX
    
    private Object object; // Umjesto "Object" može se pisati "T" u svim linijama koda; to neće predstavljati problem za klasu BOXUSER
    

    public Object getObject() {
        return object;
    }
    
    
    public void setObject(Object object) {
        this.object = object;
    }
    
    
}
