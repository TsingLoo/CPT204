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
        int leftHandSum = 0;
        int rightHandSum = 0;
        int leftHandPointer = 0;
        int rightHandPointer = list.size()-1;

        if(list.size() == 1)
        {
            return false;
        }

        for (int i = 0; i < list.size()+1; i++)
        {



            if(leftHandSum == rightHandSum)
            {
                if(rightHandPointer + 1 == leftHandPointer){ return true;}
                else {
                    leftHandSum += list.get(leftHandPointer);
                    leftHandPointer += 1;
                }
            }else if(leftHandSum - rightHandSum > 0)
            {
                rightHandSum += list.get(rightHandPointer);
                rightHandPointer -= 1;
            }
            else if(rightHandSum - leftHandSum > 0)
            {
                leftHandSum += list.get(leftHandPointer);
                leftHandPointer +=1;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(123);
        System.out.println(isPartitionable(list));
    }




}