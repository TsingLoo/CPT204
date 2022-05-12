public class reOrderArray {
    public int[] reOrderArray(int[] array)
    {
        int oddPointer = 0;

        //int[] result = new int[array.length];
        for(int i = 0; i<array.length; i++)
        {
            if((array[i] & 1) == 1)
            {
                int temp = array[i];
                //不可以从前往后，因为这样会一直复制上一个修改过的值
                for(int j = i; j>oddPointer;j--)
                {
                    array[j] = array[j-1];
                }
                array[oddPointer] = temp ;
                oddPointer +=1;
            }
        }

        return  array;
    }
}
