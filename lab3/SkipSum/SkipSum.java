import java.util.Arrays;
import java.util.List;

public class SkipSum {
    /**
     * Decide whether there is a subset in the input list
     * that adds up to the target sum, where adjacent integers
     * in the list must not be both in the subset.
     * For example, skipSum([2, 5, 10], 12) → true,
     * and skipSum([2, 5, 10], 7) → false.
     *
     * @param list is the input list.
     * @param sum  is the target sum.
     * @return true iff there is a subset of non-adjacent integers
     * in the list that adds to sum.
     */
    public static boolean skipSum(List<Integer> list, int sum) {
        // call your recursive helper method
        return skipSumHelper(list, 0, sum);
    }

    private static boolean skipSumHelper(List<Integer> list, int start, int sum) {
        if(sum == 0)
            return true;
        if(start >= list.size())
            return false;

        if(list.get(start) >sum)
        {
            return skipSumHelper(list,start+1,sum);
        }


        return skipSumHelper(list,start+2,sum-list.get(start))
                || skipSumHelper(list,start+1,sum);
    }






    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(0);
        int sum = 4;
        System.out.println(skipSum(list, sum));

    }

}


