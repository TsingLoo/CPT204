import java.util.*;

public class squareSum
{

    public static void main(String[] args)
    {
        long squareSum = 0;
        for (int i=1;i<2020;i++)
        {
            if(is2019(i))
            {

                squareSum += (long)i*i;
            }

        }
        System.out.println(squareSum);

    }

    private static boolean is2019(int n)
    {
        while(n!=0)
        {
            int temp = n%10;
            if(temp == 2||temp==0||temp==1||temp==9)
            {
                return true;
            }else
            {
                n = n / 10;
            }
        }
        return false;
    }
}











