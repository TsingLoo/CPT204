public class WeightedQuickUnion {

    private int[] parent;

    /*
     * Returns the parent of element p.
     * If p is the root of a tree, returns the negative size
     * of the tree for which p is the root.
     */
    public int parent(int p) {
        return parent[p];
    }

    /* Prints the parents of the elements, separated by a space */
    public void printParent() {
        for (int element : parent) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    /*
     ***************************
     * DO NOT MODIFY CODE ABOVE
     ***************************
     */


    /*
     ***** HELPER METHODS START *****
     */

    // Add your own helper methods here
	// INCLUDE your helper methods in your submission !
	
	
	

    /*
     ***** HELPER METHODS END *****
     */


    // LAB EXERCISE 9.3  CONSTRUCTOR

    /**
     * Creates a Union Find data structure with n elements,
     * 0 through n-1.
     * Initially, each element is in its own set.
     * @param N the number of elements
     */
    public WeightedQuickUnion(int N) {
        parent = new int[N];

        for(int i=0 ; i<N; i++)
        {
            parent[i] = -1;
        }
		
		
    }


    // LAB EXERCISE 9.4 VALIDATE

    /**
     * Validates that p is a valid element/index.
     * @throws IllegalArgumentException if p is not a valid index.
     */
    public void validate(int p){
        if( p <0 || p>= parent.length)
        {
            throw new IllegalArgumentException();
        }
    }


    // CODING ASSIGNMENT 9.1  SIZE OF

    /**
     * Returns the size of the set element p belongs to.
     * @param p an element
     * @return the size of the set containing p
     */
    public int sizeOf(int p) {
        if(parent[p]<0){
            int result = -parent[p];
            return result;
        }else{
            return sizeOf(parent[p]);
        }
    }
	
	
	// CODING ASSIGNMENT 9.2  IS SAME GROUP

    /**
     * Returns true iff elements p is in the same group as q.
     * @param p an element
     * @param q the other element
     * @return true if p and q are in the same group
     *         false otherwise
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public boolean isSameGroup(int p, int q) {
        validate(p);
        validate(q);
        if(parent[p]>=0)
        {
            return isSameGroup(parent[p],q);
        }else if(parent[q]>=0)
        {
            return isSameGroup(p,parent[q]);
        }else{
            return p==q;
        }
    }


    // CODING ASSIGNMENT 9.3  UNION

    /**
     * Combines two elements p and q together,
     * by combining the sets containing them.
     * @param p an element
     * @param q the other element
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public void union(int p, int q) {
        validate(p);
        validate(q);
        if(isSameGroup(p,q))
        {
            return;
        }
        if(parent[p]>=0)
        {
            union(parent[p],q);
        }else if(parent[q]>=0)
        {
            union(p,parent[q]);
        }else if (parent[p]<parent[q])
        {
            parent[p]=parent[q]+parent[p];
            parent[q]=p;
        }else{
            parent[q]=parent[q]+parent[p];
            parent[p]=q;
        }
		
		
    }


    public static void main(String[] args) {
        WeightedQuickUnion uf = new WeightedQuickUnion(4);
        uf.union(1, 0);
        uf.union(3, 2);
        uf.union(3, 1);
        uf.printParent();
    }

}
