import java.util.Arrays;
import java.util.List;

public class CountRuns {

    /**
     * Count the number of runs in a list.
     * For example, countRuns([1, 2, 2, 2, 3]) = 1.
     * @param list is a list of integers.
     * @return the number of runs in list.
     */
    public static int countRuns(List<Integer> list) {
        int runs = 0;
        if(list.size() == 0 || list.size() == 1) {return 0;};
        int temp = list.get(0);
        boolean run = false;

        for(int i = 1; i < list.size(); i++)
        {
            if(temp == list.get(i))
            {
                if(!run)
                {
                    run = true;
                    runs += 1;
                }
            }else
            {
                if(run)
                {
                    run = false;
                }
            }
            temp = list.get(i);
        }
        return runs;
    }

    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 5, 5);
        System.out.println(countRuns(list));
    }


}