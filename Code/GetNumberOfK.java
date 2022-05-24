public class GetNumberOfK {
    public int GetNumberOfKMethod(int [] array , int k) {
        if(array.length == 0)
        {
            return 0;
        }

        if(array.length == 1)
        {
            if(array[0] == k )
            {
                return 1;
            }
            else
            {
                return 0;
            }

        }

        int left = 0;
        int right = array.length-1;
        while(left <= right)
        {
            int mid = (left+right)/2;
            if(array[mid] < k)
            {
                left = mid+1;
            }else if(array[mid]>k)
            {
                right = mid-1;
            }else
            {
                int behind = mid + 1;
                int before = mid;

                if( before<0 || behind>array.length-1 )
                    break;

                while(array[before] == array[mid])
                {
                    before--;
                    if(before<0)
                        break;
                }

                while(array[behind] == array[mid])
                {
                    behind++;
                    if(behind>array.length-1)
                        break;
                }

                int count = behind - before-1;

                return count;
            }
        }

        return  0;
    }
}
