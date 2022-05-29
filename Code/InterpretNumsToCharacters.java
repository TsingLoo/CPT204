import java.util.*;

public class InterpretNumsToCharacters {
    public int InterpretNumsToCharactersMethod(String nums)
    {
        if(nums.length() <2)
        {
            return nums.length();
        }

        if(nums == "10" || nums == "20")
        {
            return  1;
        }

        //出现了0，但是并不是10和20的情况，是无法编码的
        for(int i = 1; i < nums.length(); i++){
            if(nums.charAt(i) == '0')
                if(nums.charAt(i - 1) != '1' && nums.charAt(i - 1) != '2')
                    return 0;
        }

        int[] dp = new int[nums.length() + 1];

        Arrays.fill(dp, 1);

        //从第三个数字开始,注意这里是<=号，因为会检查到最后一位
        for(int i=2; i<= nums.length();i++)
        {
            //在11-19，21-26之间的情况
            if((nums.charAt(i - 2) == '1' && nums.charAt(i - 1) != '0') || (nums.charAt(i - 2) == '2' && nums.charAt(i - 1) > '0' && nums.charAt(i - 1) < '7'))
                dp[i] = dp[i - 1] + dp[i - 2];
            else
                dp[i] = dp[i - 1];
        }

        return  dp[nums.length()];
    }


    public static void main(String[] args)
    {
        InterpretNumsToCharacters me = new InterpretNumsToCharacters();
        System.out.println(me.InterpretNumsToCharactersMethod("31717126241541717"));
    }
}
