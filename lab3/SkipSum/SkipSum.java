import java.util.List;

public class SkipSum {
    /**
     * Decide whether there is a subset in the input list
     * that adds up to the target sum, where adjacent integers
     * in the list must not be both in the subset.
     * For example, skipSum([2, 5, 10], 12) → true,
     * and skipSum([2, 5, 10], 7) → false.
     * @param list is the input list.
     * @param sum is the target sum.
     * @return true iff there is a subset of non-adjacent integers
     * in the list that adds to sum.
     */
    public static boolean skipSum(List<Integer> list, int sum) {
        // call your recursive helper method
        return skipSumHelper(list, 0, sum);
    }

    private static boolean skipSumHelper(List<Integer> list, int start, int sum) {
        // base case
        
		
		
        // recursive step
        
		
		return false;
    }
}
