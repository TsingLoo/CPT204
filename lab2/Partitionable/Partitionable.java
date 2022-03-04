import java.util.Arrays;
import java.util.List;

public class Partitionable {

    /**
     * Decide whether a list is partitionable.
     * For example, isPartitionable([1, 1, 1, 2, 1]) -> true,
     * and isPartitionable([2, 1, 1, 2, 1]) -> false.
     * @param list is a non-empty list of integers.
     * @return true iff list is partitionable.
     */
    public static boolean isPartitionable(List<Integer> list) {
        int sum = 0;
        for (int num : list)
        {
            sum += num;
        }
        if (sum == 0)
        {
            return true;
        }else if(list.size() ==1)
        {
            return false;
        }

        for(int i = 0; i < list.size()-1; i++)
        {
            int left = 0;
            int right= 0;
            for(int j = 0; j <= i; j++)
            {
                left += list.get(j);
            }
            for(int k = i+1; k< list.size();k++)
            {
                right += list.get(k);
            }
            if(left == right)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1);
        System.out.println(isPartitionable(list));
    }




}