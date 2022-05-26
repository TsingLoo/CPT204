
import javax.sound.sampled.Line;
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

    public ConnectCoins(boolean[][] ccMatrix) {
        int num = ccMatrix.length*ccMatrix[0].length;
        uf1 = new UnionFind(num);
        for (int n=0;n<ccMatrix.length;n++){
            for(int m=0;m<ccMatrix[n].length;m++){
                if(ccMatrix[n][m]==true){
                    if(n>0&&ccMatrix[n-1][m]==true){
                        uf1.union(n*ccMatrix[0].length+m, (n-1)*ccMatrix[0].length+m);
                    }
                    if(m>0&&ccMatrix[n][m-1]==true){
                        uf1.union(n*ccMatrix[0].length+m, n*ccMatrix[0].length+m-1);
                    }
                    if(n<ccMatrix.length-1&&ccMatrix[n+1][m]==true){
                        uf1.union(n*ccMatrix[0].length+m, (n+1)*ccMatrix[0].length+m);
                    }
                    if(m<ccMatrix[0].length-1&&ccMatrix[n][m+1]==true){
                        uf1.union(n*ccMatrix[0].length+m, n*ccMatrix[0].length+m+1);
                    }
                }
            }
        }
        this.ccMatrix = ccMatrix;
        int maxCoin = 0;

        int temp_max = 0;
        int r = 0;
        int c = 0;
        for (int n=0;n<ccMatrix.length;n++){
            for(int m=0;m<ccMatrix[n].length;m++){
                ArrayList<Integer> a = new ArrayList<Integer>();
                if(ccMatrix[n][m]==false){
                    temp_max = 0;
                    if(n>0&&ccMatrix[n-1][m]==true){
                        a.add((n-1)*ccMatrix[0].length+m);
                    }
                    if(m>0&&ccMatrix[n][m-1]==true){
                        a.add(n*ccMatrix[0].length+m-1);
                    }
                    if(n<ccMatrix.length-1&&ccMatrix[n+1][m]==true){
                        a.add((n+1)*ccMatrix[0].length+m);
                    }
                    if(m<ccMatrix[0].length-1&&ccMatrix[n][m+1]==true){
                        a.add(n*ccMatrix[0].length+m+1);
                    }
                    for(int i=0;i<a.size();i++){
                        for(int i2=i+1;i2<a.size();i2++){
                            if(uf1.isSameGroup(a.get(i),a.get(i2))){
                                a.remove(i2);
                                i2--;
                            }
                        }
                    }
                    for(int i=0;i<a.size();i++){
                        temp_max += uf1.sizeOf(a.get(i));
                    }
                    if(temp_max> maxCoin){
                        maxCoin = temp_max;
                        r = n;
                        c = m;
                    }
                }
            }
        }
        row = r;
        column = c;
        uf2 = new UnionFind(1000000);
        uf2.union(0,  maxCoin);
    }

    public int[] placeMaxConnCoins() {
        int[] position = {row, column};
        return position;
    }


    public int maxConnCoins() {
        return uf2.find(0)+1;
    }
}


