

/** Rotating Singly-Linked List */

// Complete the class declaration so that
// RSLList becomes a subclass of SLList

public class RSLList<T> extends SLList<T> {

    /**
     * Rotates list to the right.
     * Do nothing if the list is empty.
     */
    public void rotateRight() {
		T x = delLast();
        if(x==null)
            return;
        addFirst(x);
		
		
    }

}