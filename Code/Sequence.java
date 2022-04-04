import java.util.*;

public class Sequence {
    public static void main(String[] args)
    {
        int result = 0;
        String str = "";
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            for(int i = 0; i < n; i++)
            {
                str = str + sc.nextLine();
            }
            for(int i=0 ; i<str.length()-2;i++)
            {
                if(str.charAt(i) == '0')
                {
                    if(str.charAt(i+1) == '0')
                    {
                        result +=2;
                    }else
                    {
                        if(str.charAt(i+2) == '0')
                        {
                            result += 1;
                        }
                    }
                }
            }
            System.out.println(result);
        }
    }
}
