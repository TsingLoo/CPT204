import edu.princeton.cs.algs4.Stack;

import java.lang.reflect.Array;
import java.util.*;
public class itrDfs {


    public static void main(String[] args){
        Stack<Long> stack = new Stack<Long>();
        long cur = 2;
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            long above = sc.nextLong();
            long bottom = sc.nextLong();

            while(true)
            {
//                if(recDfs(1,cur,above,bottom))
//                    break;
//                cur++;
//                //System.out.println(above*cur - bottom);
                if(above*cur == bottom) {
                    stack.push(cur);
                    break;
                }else if((above*cur - bottom)>0)
                {
                    above = above*cur - bottom;
                    bottom = bottom*cur;
                    stack.push(cur);
                    System.out.println();
                }
                    cur ++;

            }
            for(Long num: stack)
            {
                System.out.println("1/" + num);
            }

        }
    }

//    private static boolean recDfs(int cur, int maxDeep, int above, int bottom){
//        if(above==0)
//        {
//            return true;
//        }
//
//        for(int  j = cur + 1; j < maxDeep; j++)
//        {
//            int newAbove = above*cur - bottom;
//            int newBottom = bottom*cur;
//            stack.push(j);
//            if(recDfs(j,maxDeep,newAbove,newBottom))
//            {
//                return true;
//            }
//            stack.pop();
//        }
//        return false;
//    }
}
