import java.util.Scanner;

public class climb {
    public static  void main(String[] args)
    {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
                n = sc.nextInt();
                System.out.print(climbCount(n));
                System.exit(0);
        }

    }

    private static int climbCount(int n)
    {
        int f=0;
        if(n==1||n==0||n==2)
        {
            return n;
        }else
        {
            return climbCount(n-1)+climbCount(n-2);
        }
    }


}
