import java.lang.reflect.Array;
import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args)
    {
        int[] number={13,15,24,99,14,11,1,2,3};
        System.out.println("排序前：");
        for(int val:number) {
            System.out.print(val+" ");
        }
            quickSort(number);
        System.out.println("\n排序后：");
        for(int val:number) {
            System.out.print(val +" ");
        }
        System.out.println();
        System.out.println(BinarySearch.binarySearch(number,14));


    }


    //完成一次将一个数设为中轴，并对其两边排序。
    public static int getMiddle(int[] nums,int left,int right)
    {
        int temp = nums[left];
        while (left < right)
        {
            while (left < right && nums[right] > temp)
            {
                right --;
            }
            nums[left] = nums[right];
            while(left<right && nums[left] < temp)
            {
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = temp;
        return left;
    }

    public static void unckSort(int[] nums,int left, int right)
    {
        if(left<right)
        {
            int middle = getMiddle(nums,left,right);
            unckSort(nums,left,middle-1);
            unckSort(nums,middle+1,right);
        }
    }

    public static int[] quickSort(int[] nums){
        if(nums.length > 0) {
            unckSort(nums, 0, nums.length - 1);
        }
        return nums;
    }



}
