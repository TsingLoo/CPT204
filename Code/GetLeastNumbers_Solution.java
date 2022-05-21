import java.util.ArrayList;
import java.util.PriorityQueue;

public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Method(int[] input, int k)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(k==0||input.length == 0)
        {
            return res;
        }

        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2)->o2.compareTo(o1));
        for(int i=0;i<k;i++)
        {
            q.offer(input[i]);
        }

        for(int i=k;i<input.length;i++)
        {
            if(q.peek() > input[i])
            {
                q.poll();
                q.offer(input[i]);
            }
        }

        for(int i=0;i<k;i++)
        {
            res.add(q.poll());
        }
        return  res;

    }
}
