package advancedJavaTwo;

import predavanje7.Shape; // CTRL + SHIFT + I = importovanje
// Dizajn princip: Kod treba biti closed for modification and open for extension
// Klasa treba da ima samo jedan razlog za izmjenu, npr. izmjena stope PDV-a i sl.
public class ShapePair<K extends Number, V extends Shape> implements Pair<K, V>{
    
    
    private K key;
    private V value;

    public ShapePair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    
    
    @Override
    public K getKey() {
        return key;
        
    }

    @Override
    public V getValue() {
        return value;
    }
    
}
