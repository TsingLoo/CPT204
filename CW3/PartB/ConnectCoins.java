import java.util.ArrayList;       // optional

public class ConnectCoins {

    private final UnionFind uf1;
    private final UnionFind uf2;  // optional
    private final boolean[][] ccMatrix;   // optional
    private final int row;        // optional
    private final int column;     // optional


    /*
     *****  DO NOT CHANGE ANY INSTANCE VARIABLES ABOVE *****
     *****  DO NOT ADD ANY INSTANCE VARIABLES **************
     *****  DO NOT ADD ANY LIBRARIES ******** **************
     *****  VIOLATION = 0 MARKS IN PART B ******************
     */

    /*
     ***** HELPER METHODS START *****
     */

    // Add your own helper methods here
    // INCLUDE your helper methods in your submission !



    /*
     ***** HELPER METHODS END *****
     */


    // COURSEWORK 3 PART B.1 Connect Coin CONSTRUCTOR

    /**
     * Initializes the instance variable including a UnionFind data structure.
     * @param ccMatrix is s a 2-D boolean array of true (T) and false (F) values
     *                 to represent the 2-D space where A T in a coordinate indicates that there is a coin
     *                 at that position in the 2-D space, while an F indicates an empty space
     */
    public ConnectCoins(boolean[][] ccMatrix) {
        uf1 = null;
        uf2 = null;
        this.ccMatrix = null;
        row = 0;
        column = 0;
    }

    // COURSEWORK 3 PART B.2 Connect Coins PLACE MAX CONNECTED COINS

    /**
     * @return a 2-element integer array that represents the coordinate in [row, column],
     * so that a coin that is placed in that coordinate will give the maximum number of newly connected coins.
     * If there are multiple possible such placements, return the left-and-topmost coordinate.
     */

    public int[] placeMaxConnCoins() {


        return null;
    }


    // COURSEWORK 3 PART B.3 Connect Coins MAX CONNECTED COINS

    /**
     * @return the maximum number of newly connected coins after placing a new coin.
     */

    public int maxConnCoins() {


        return 0;
    }

}
