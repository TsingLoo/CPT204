import java.util.Arrays;
import java.util.List;

public class OddAndTen {
    /**
     * Decide if it is possible to divide the integers in a list into two sets,
     * so that the sum of one set is odd, and the sum of the other set is a multiple of 10.
     * Every integer must be in one set or the other.
     * For example, oddAndTen([5, 5, 3])  →  true,
     * and oddAndTen([5, 5, 4])  →  false.
     * @param list is a list of integers.
     * @return true iff there is one odd partition and the other multiple of 10.
     */
    public static boolean oddAndTen(List<Integer> list) {
        // call your recursive helper method
        return oddAndTenHelper(0, list,0,0);
    }

    private static boolean oddAndTenHelper(int start, List<Integer> list, int LeftSum, int RightSum)
    {
        if(list.size() == 1)
        {

        }

        if (start >= list.size()) {
            return LeftSum % 10 == 0 && RightSum % 2 == 1;
        }

        // 2. Recursive case: assign a number to either first group or second group.
        int thisNum = list.get(start);
        // 2.1 Try assigning the number to first group
        if ( oddAndTenHelper(start+1, list, LeftSum+thisNum, RightSum) )
            return true; // success!

        // 2.2 Try assigning it to second group
        // this is the last case, so return whatever the recursive call returns
        return oddAndTenHelper(start+1, list, LeftSum, RightSum+thisNum);
    }

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(0);
        System.out.println(oddAndTen(list));
    }


}
