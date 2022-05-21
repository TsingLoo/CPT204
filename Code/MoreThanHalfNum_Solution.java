import  java.util.*;
public class MoreThanHalfNum_Solution {
    public  int MoreThanHalfNum(int[] array)
    {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        //遍历数组
        for(int i=0; i<array.length;i++)
        {
            if(!mp.containsKey(array[i]))
            {
                mp.put(array[i], 1);
            }else
            {
                mp.put(array[i],mp.get(array[i])+ 1);
            }

            if(mp.get(array[i])>array.length/2)
                return  array[i];
        }
        return  0;
    }
}
