package advancedJavaSix;

import java.util.List;

public interface Dao<E> { // Layer - sadrži funkcije koje će implementirati CRUDE operacije (create, retrieve, update, delete)
                          // E je parametrizirani objektni tip
 public void save(E entity); // create
 
 public E get(long id); // retrieve
 
 public List<E> getAll();
 
 public void update(E entity, String... params);
 
 public void delete(E entity);
 
}
