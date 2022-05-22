import java.util.HashMap;
import java.util.Map;

public class FirstNotRepeatingChar {
    public int FirstNotRepeatingCharMethod(String str)
    {
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(!mp.containsKey(str.charAt(i)))
            {
                mp.put(str.charAt(i),i);
            }else
            {
                mp.put(str.charAt(i),-1);
            }
        }


        for(int i =0; i< str.length();i++)
        {
            if(mp.get(str.charAt(i)) != -1)
            {
                return mp.get(str.charAt(i));
            }
        }


        return  -1;


    }
}
