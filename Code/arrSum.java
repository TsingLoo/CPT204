
public class arrSum {
    public static void main(String[] args)
    {
        System.out.println(mod(20190324));



    }

    private static int mod(int n)
    {
        int a =1;
        int b =1;
        int c =1;
        int status =0;

        for(int i=4;i<20190325;i++)
        {
            status=(a+b+c)%10000;
            a=b;
            b=c;
            c=status;
        }
        return status;

    }





    private static long recur(long n)
    {
        if(n == 0 || n==1||n==2)
        {
            return 1;
        }else if(n==3)
        {
            return 3;
        }else
        {
            return recur(n-2)+recur(n-1)+recur(n-3);
        }
    }
}
