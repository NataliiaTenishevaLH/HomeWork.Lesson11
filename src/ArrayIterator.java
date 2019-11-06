import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator implements Iterator<String> {
       int index;
       String[] arrayIterator;
       boolean canRemove;

    public ArrayIterator(String[] array) {
          index = 0;
          arrayIterator = array;
    }


    // Checks if the next element exists
    public boolean hasNext( ) {
           if ((index) >= arrayIterator.length){
               return false;
           }
           return true;
    }

    // moves the cursor/iterator to next element
    public String next() {
       if(hasNext()) {
           canRemove = true;
           return arrayIterator[index++];
       }
        throw new NoSuchElementException();
    }


    public void remove() {
        if (!canRemove)
        {
            throw new IllegalStateException();
        }
        this.arrayIterator[index  - 1] = null;
        canRemove = false;
    }

}
