import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSortBinarySearch {
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
        System.out.println(binarySearch(number,13));


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


    private static int binarySearch(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length-1;

        while(left <= right)
        {
            int mid = (left + right)/2;
            if(target == nums[mid])
            {
                return mid;
            }else if(nums[mid] > target)
            {
                left = mid + 1;
            }else if(nums[mid] < target)
            {
                right = mid - 1;
            }
        }

        return -1;
    }
}
