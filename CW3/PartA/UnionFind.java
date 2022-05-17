//https://algs4.cs.princeton.edu/15uf/WeightedQuickUnionPathCompressionUF.java.html

public class UnionFind {

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
     *****  DO NOT CHANGE ANY INSTANCE VARIABLES ABOVE *****
     *****  DO NOT ADD ANY INSTANCE VARIABLES **************
     *****  DO NOT ADD ANY LIBRARIES ******** **************
     *****  VIOLATION = 0 MARKS IN PART A ******************
     */


    /*
     ***** HELPER METHODS START *****
     */



    /*
     ***** HELPER METHODS END *****
     */


    // COURSEWORK 3 PART A.1 Union Find CONSTRUCTOR

    /**
     * Creates a Union Find data structure with N elements,
     * 0 through N-1.
     * Initially, each element is in its own set.
     * @param N the number of elements
     */
    public UnionFind(int N) {
        this.parent = new int[N];
        for (int i = 0; i < N; i++) {
            parent[i] = i;
        }
    }


    // COURSEWORK 3 PART A.2 Union Find VALIDATE

    /**
     * Validates that p is a valid element/index.
     * @param p is an element
     * @throws IllegalArgumentException if p is not a valid index.
     */
    public void validate(int p) {
        int n = parent.length;
        if (p < 0 || p >= n) {
            throw new IllegalArgumentException("index " + p + " is not between 0 and " + (n - 1));
        }
    }


    // COURSEWORK 3 PART A.3 Union Find SIZE OF

    /**
     * Returns the size of the set element p belongs to.
     * @param p is a valid element
     * @return the size of the set containing p
     */
    public int sizeOf(int p) {
        int count = 0;
        for(int i=0;i<this.parent.length;i++)
        {

        }


        return 0;
    }


    // COURSEWORK 3 PART A.4 Union Find FIND

    /**
     * Returns the group identity number which is the root of the tree element p belongs to.
     * Path-compression is now employed allowing for fast search-time.
     * @param p is a valid element
     * @return the root of the group p belongs to.
     */
    public int find(int p) {

            validate(p);
            int root = p;
            while (root != parent[root])
                root = parent[root];
            while (p != root) {
                int newp = parent[p];
                parent[p] = root;
                p = newp;
            }
            return root;

    }


    // Note that now, the method isSameGroup(int p, int q) is given
    // Using find above, it simply checks whether find(p) is the same as find(q)

    /**
     * Returns true iff elements p is in the same group as q.
     * @param p is an element
     * @param q is the other element
     * @return true if p and q are in the same group
     *         false otherwise
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public boolean isSameGroup(int p, int q) {
        validate(p);
        validate(q);
        return find(p) == find(q);
    }


    // COURSEWORK 3 PART A.5 Union Find UNION

    /**
     * Combines two elements p and q together,
     * by combining the sets containing them.
     * @param p is an element
     * @param q is the other element
     * @throws IllegalArgumentException if p or q is not a valid index.
     */
    public void union(int p, int q) {



    }


    public static void main(String[] args) {
        UnionFind uf = new UnionFind(4);
        uf.union(1, 0);
        uf.union(3, 2);
        uf.union(3, 1);
        uf.printParent();

    }
}
