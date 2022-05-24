public class GetNumberOfK {
    public int GetNumberOfKMethod(int [] array , int k) {
        return  binarySearch(array, k+0.5) - binarySearch(array,k-0.5);


    }


    public int binarySearch(int[] arrary, double key)
    {





        int left = 0;
        int right = arrary.length-1;
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(arrary[mid] < key)
            {
                left = mid +1;
            }else if(arrary[mid] > key)
            {
                right = mid -1;

            }
        }
        return  left;
    }
}
