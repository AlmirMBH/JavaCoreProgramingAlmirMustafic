package advancedJavaSeven;

import java.util.Arrays;
import java.util.Iterator;
// Iterable
// Iterator
public class NaturalNumberContainer implements Iterable<Integer>{
    
    private int size = 0;
    private Integer[] arrays = new Integer[size];
    
    public boolean add(Integer number){ // Umjesto "int" mora se koristiti "Integer" jer je objektni tip
        size++;
        arrays = Arrays.copyOf(arrays, size);
        arrays[size-1] = number;
        return true;
    }
    
    @Override
    public Iterator<Integer> iterator(){
     return new NaturalNumberIterator();   
    }
    
    private class NaturalNumberIterator implements Iterator<Integer>{
        
        private int cursor = 0; // Programer definiše početnu tačku prolaska kroz petlju; u ovom slučaju od '0'
                             // kao i to da li kreće od najvećeg ili najmanjeg indeksa i da li se smanjuje ili povećava
                             // npr. iteracija unazad: private int cursor = size-1; --> 
                             // dok bi u hasNext() metodi bilo: boolean hasNext = cursor >= 0; a u next() metodi "cursor--;"
        @Override
        public boolean hasNext() {
            boolean hasNext = cursor <= (size-1);
            return hasNext;
        }

        @Override
        public Integer next() {
            Integer numberValue = arrays[cursor];
            cursor = cursor+1; // Programer definiše način prolaska kroz petlju
            return numberValue;
        }
        
    }
}
    
/*
    @Override
    public Iterator<Integer> iterator() { // iterator je funkcija koja vraća objekat tipa iterator koji je interface
        Iterator<Integer> numberIterator = new NaturalNumberIterator();
        return numberIterator;
    }
    
    private class NaturalNumberIterator implements Iterator<Integer>{
        
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return nextIndex <= capacity-1;
        }

        @Override
        public Integer next() {
            Integer valueInteger = arrays[nextIndex];
            nextIndex = nextIndex+1;
            return valueInteger;
        }

        @Override
        public void remove() {
            Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
        }
        
    }
}
*/