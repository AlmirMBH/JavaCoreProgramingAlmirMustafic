package advancedJavaTwo;
// 
// GENERIČKI TIPOVI - K, V - bilo šta što naslijeđuje java.lang.object
// UNBOUNDED GENERIC TYPE
public interface Pair<K, V> { // K i V vidljivo samo unutar bloka koda interface-a, Interface je public, ali su oni uvijek private
    public K getKey(); // "K" postaje konkretno u momentu kreiranja objekta
    
    public V getValue();
}
