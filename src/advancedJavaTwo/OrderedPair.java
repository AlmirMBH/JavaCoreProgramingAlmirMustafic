package advancedJavaTwo;
// K1 i V1 su generički tipovi "OrderedPair"
public class OrderedPair<K1, V1> implements Pair<K1, V1>{ // Ukoliko nakon "OrderedPair" ne napišemo K1 i V1 i sl., implementirani interface moramo parametrizirati nečim što naslijeđuje java.lang.object
    
    private final K1 key;
    private final V1 value;

    // DI - DEPENDENCY INJECTION
    public OrderedPair(K1 key, V1 value) {
        this.key = key;
        this.value = value;
    }
    
    @Override
    public K1 getKey() {
        return key;
    }

    @Override
    public V1 getValue() {
        return value;
    }
    
}
