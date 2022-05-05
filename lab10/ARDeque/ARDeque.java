
import java.util.ArrayDeque;

import java.util.Iterator;


public class ARDeque<T> implements Deque<T>,Iterable<T>{
    private T[] items;
    private int size;
    private int nextFirst;
    private int nextLast;


    /**
     * @return the size of the array used in the deque.
     */
    public int itemsLength() {
        return items.length;
    }

    /**
     * @return the number of items in the deque.
     */
    public int size() {
        return size;
    }

    /**
     * @return true if deque is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    /*
     ******************* HELPER METHODS START *******************
     ***** Include your helper method(s) in EACH Submission *****
     *********************** that uses it ***********************
     */
    private int plusOne(int index){
        return (index+1)% items.length;
    }

    private int minusOne(int index){
        return (index-1+items.length)%items.length;
    }


    /* Resizes the underlying array to the target capacity. */
    @SuppressWarnings("unchecked")
    private void resize(int capacity) {
        T [] a=(T[])new Object[capacity];
        int curr=plusOne(nextFirst);
        for (int i = 0; i<size;i++){
            a[i]=items[curr];
            curr=plusOne(curr);
        }
        items=a;
        nextFirst=capacity-1;
        nextLast=plusOne(size-1);
    }

    /*
     ******************** HELPER METHODS END ********************
     */
    @Override
    public Iterator<T> iterator() {
        return new ARDequeIterator();



    }

    private class ARDequeIterator implements Iterator<T> {
        private int index;
        public ARDequeIterator(){index=0;}
        public boolean hasNext(){return index<size;}
        public T next(){
            T nextItem=get(index);
            index++;
            return nextItem;
        }




    }


    // LAB EXERCISE 8.1 EMPTY CONSTRUCTOR

    /**
     * Creates an empty deque.
     */
    @SuppressWarnings("unchecked")
    public ARDeque() {
        size=0;
        items=(T[])new Object[4] ;
        nextLast=1;
        nextFirst=0;
    }


    // LAB EXERCISE 8.2 ADD TO BACK

    /**
     * Adds an item of type T to the back of the deque.
     * @param item is a type T object to be added.
     */
    @Override
    public void addLast(T item) {

        if (size==items.length){
            resize(size*2);
        }
        items[nextLast]=item;
        size++;
        nextLast=plusOne(nextLast);
    }


    // LAB EXERCISE 8.3 PRINT ITEMS

    /**
     * Prints the items in the deque from first to last,
     * separated by a space, ended with a new line.
     */
    public void printDeque() {
        int j=plusOne(nextFirst);
        for(int i=0;i<size;i++){
            System.out.print(items[j]+" ");
            j=plusOne(j);


        }
        System.out.println();


    }


    // LAB EXERCISE 8.4 GET ITEM

    /**
     * Gets the item at the given index.
     * Does not mutate the deque.
     * @param index is an index where 0 is the front.
     * @return the index-th item of the deque.
     * @throws IndexOutOfBoundsException if no item exists at the given index.
     */
    public T get(int index) {
        int realindex;
        if(isEmpty()||index<0||index>=size) {
            throw new IndexOutOfBoundsException("Index "+index+" is not valid");

        }
        return items[plusOne(index+nextFirst)];
    }


    // EXERCISE 8.1 ADD TO FRONT

    /**
     * Adds an item of type T to the front of the deque.
     * @param item is a type T object to be added.
     */
    public void addFirst(T item) {
        if(size==items.length){
            resize(size*2);
        }
        items[nextFirst]=item;
        nextFirst=minusOne(nextFirst);
        size++;


    }


    // EXERCISE 8.2 DELETE FRONT

    /**
     * Deletes and returns the item at the front of the deque.
     * If no such item exists, returns null.
     * @return the first item of the deque, null if it does not exist.
     */
    public T delFirst() {
        if (size == 0) {
            return null;
        }
        nextFirst = plusOne(nextFirst);
        size--;
        T realitem = items[nextFirst];
        if (size <= items.length / 4) {


            resize(items.length / 2);
        }
        return realitem;
    }



    // EXERCISE 8.3 DELETE BACK

    /**
     * Deletes and returns the item at the back  of the deque.
     * If no such item exists, returns null.
     * @return the last item of the deque, null if it does not exist.
     */
    public T delLast() {
        if(size==0){
            return null;
        }
        nextLast=minusOne(nextLast);
        size--;
        T realitem=items[nextLast];
        if(size<=items.length/4){
            resize(items.length/2);
        }
        return realitem;
    }


    // EXERCISE 8.4 COPY CONSTRUCTOR

    /**
     * Creates a (deep) copy of another Deque object.
     * @param other is another ARDeque<T> object.
     */
    @SuppressWarnings("unchecked")
    public ARDeque(ARDeque<T> other) {
        this.nextLast=other.nextLast;
        this.nextFirst=other.nextFirst;
        this.size=other.size;
        items=items=(T[])new Object[other.items.length];
        for(int i=0;i<items.length;i++){
            items[i]=other.items[i];
        }
    }


}
