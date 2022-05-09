public class cutRope {
    public int cutRopeMehod (int n) {
        int[] dp = new int[n+1];

        if(n == 2)
        {
            return 1;
        }
        if(n == 3)
        {
            return 2;
        }
        if(n == 4)
        {
            return 4;
        }

        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;


        //对于总长度来说，向后推进
        for(int i = 4; i <= n;i++)
        {
            //对于当前推进的长度，J为一刀砍在哪里
            for(int j = 1;  j<=(i/2) ; j++)
            {
                dp[i] = Math.max(dp[i],dp[j]*dp[i-j]);
            }
        }

        return dp[n];

        // write code here
    }
}
