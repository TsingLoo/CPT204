import java.util.Iterator;

public class ARSet<T> implements Iterable<T> {
    private T[] items;
    private int size;

    /**
     * Create an empty set.
     */
    @SuppressWarnings("unchecked")
    public ARSet() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /**
     * @return the number of items in the set
     */
    public int size() {
        return size;
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    // Copy paste your code from Week 10 here

    @Override
    public Iterator<T> iterator() {
        return new ARSetIterator();
    }

    private class ARSetIterator implements Iterator<T> {
        private int index;
        public ARSetIterator(){
            index=0;
        }
        public boolean hasNext(){
            return index<size;
        }
        public T next(){
            T nextItem = items[index];
            index++;
            return nextItem;
        }

    }

    public boolean contains(T item) {
        ARSetIterator iter=new ARSetIterator();
        for (ARSetIterator it = iter; it.hasNext(); ) {
            if(item.equals(it.next())){
                return true;
            }
        }




        return false;
    }


    // CODING ASSIGNMENT 10.2  ADD

    /**
     * Adds an item into the set if it is not already inside.
     * @param item to be added inside the set.
     * @throws IllegalArgumentException if item is null.
     */
    public void add(T item) {
        if(item==null){
            throw new IllegalArgumentException();
        }
        if(!contains(item)){
            size++;
            items[size-1]=item;
        }


    }

	

    // CODING ASSIGNMENT 11.2  EQUALS

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object that) {
        if(that==null)return false;
        if(this==that)return true;
        if(!(that instanceof ARSet))return false;
        ARSet thatARset=(ARSet) that;
        if(thatARset.size!=this.size)return false;
        ARSetIterator iter=new ARSetIterator();
        for (ARSetIterator it = iter; it.hasNext(); ) {
            if(!thatARset.contains(it.next())){
                return false;
            }
        }
        return true;
    }
	
}