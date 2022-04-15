import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] nums = new int[n];
            for(int i=0; i<n;i++)
            {
                nums[i] = sc.nextInt();
            }

            int[] partLen = new int[m];
            for(int i=0; i<m;i++)
            {
                partLen[i] = sc.nextInt();
            }
            Comparator c = new Comparator() {
                @Override
                public int compare(Object o1, Object o2) {
                    return 0;
                }
            };
            ArrayList<Integer> list = new ArrayList<>();
            for(int i =0; i<m;i++)
            {
                ArrayList<Integer> templist = new ArrayList<>();
                for(int j = 0; j<i;j++)
                {
                    templist.add(nums[i+j]);
                }
                templist.sort(c);
                for(int j = 0; j<i;j++)
                {
                    list.add(templist.get(j));
                }
            }
            System.out.print(list.toString());
        }
    }


}