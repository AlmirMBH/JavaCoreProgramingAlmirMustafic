package advancedJavaSeven;

import advancedJavaSix.Book.Book;
import java.util.Iterator;
import java.util.List;

public class BookPrinter {
    private final List<Book> books;

    public BookPrinter(List<Book> books) {
        this.books = books;
    }

    void printBooks() {
        for(int i = 0; i<books.size(); i++){
            Book book = books.get(i);
            System.out.println(book);
        }
    }
    
    void printEnhancedBooks(){ // U enhanced petlji može se koristiti objekat BOOKS zato što je tipa Iterable
        /*NaturalNumberContainer container = new NaturalNumberContainer();
        container.add(23);
        container.add(32);
        container.add(13);
        
        for(Integer number : container){ // Za enhanced petlju objekat (container) mora biti tipa iterable parametriziran tipom objekata Integer
            System.out.println(number);            
        }*/
        
        //Iterator<Integer> naturalNumberIterator = container.iterator(); 
        
        
        Iterator<Book> iteratorBooks = books.iterator();
        while(iteratorBooks.hasNext()){
            Book book = iteratorBooks.next();
            if(book.getId()==1){
                iteratorBooks.remove(); 
            }
                   
        }
    }
}
