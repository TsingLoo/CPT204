import java.util.List;
import java.util.ArrayList;

public class EqualSum {
    
    /**
     * Decide if it is possible to divide the integers in a list into two sets,
     * so that the sums of the two sets are the same.
     * Every integer must be in one set or the other.
     * For example, equalSum([2, 3, 5])  →  true.
     * @param list is a list of integers.
     * @return true iff there are two sets having the same sum.
     */
    public static boolean equalSum(List<Integer> list) {
        // call your recursive helper method
        return equalSumHelper(list,0,0,0);
    }

    private static boolean equalSumHelper(List<Integer> list, int start, int sum1, int sum2) { // add any parameters
        // base case
        if(list.size() == start)
            return sum1 == sum2;
		
		
        // recursive step
        
		
		return equalSumHelper(list,start+1, sum1+list.get(start),sum2)
                ||
                equalSumHelper(list,start+1,sum1,sum2+list.get(start));
    }

}
