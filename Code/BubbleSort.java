import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args)
    {
        int[] testArray = new int[] {6,2,33,12,4,2,1,34,};
        bubbleSort(testArray);
        System.out.println(Arrays.toString(testArray));


    }

    public static int[] bubbleSort(int[] nums)
    {
        for(int i=0; i< nums.length-1; i++)
        {
            for(int j=0; j<nums.length-1-i;j++)
            {
                if(nums[j] > nums[j+1])
                    {
                        int temp = nums[j];
                        nums[j] = nums[j+1];
                        nums[j+1] = temp;
                    }
            }

        }

        return nums;
    }


}
