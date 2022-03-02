import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxStretch {

    /**
     * Find the largest stretch in a list.
     * For example, maxStretch([8, 5, 1, 2, 3, 4, 5, 10]) = 6.
     * @param list is a list of integers.
     * @return the largest stretch in list.
     */
    public static int maxStretch(List<Integer> list) {
        int max = 0;
        int firPos = 0;
        List<Integer> reversed = new ArrayList<>();
        for(int i = 0; i< list.size();i++)
        {
            reversed.add(list.get(list.size()-i-1));
        }

        int leftMost = 0;
        int rightMost = 0;
        int temp = 0;

        for(int num : list)
        {
            leftMost = list.indexOf(num);
            rightMost = list.size()-reversed.indexOf(num);
            temp = rightMost - leftMost;
            if(temp>max)
            {
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(-123124,123,54,1,5,3,4,5,6,2,3,1,2);
    }
}