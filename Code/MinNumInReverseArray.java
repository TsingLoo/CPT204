public class MinNumInReverseArray {


        public int minNumberInRotateArray(int [] array) {
            if(array.length ==0)
            {
                return 0;
            }
            int left = 0;
            int right = array.length-1;
            int mid = (left + right)/2;
            while(left < right){
                mid = (left+right)/2;
                if(array[mid] > array[right])
                {
                    left = mid + 1;

                }else if(array[mid] == array[right])
                {
                    right = right -1;
                }else
                {
                    right = mid;
                }
            }
            return array[left];
        }

}
