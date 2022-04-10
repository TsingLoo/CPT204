import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

public class printArrayFromTailtoHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        while(listNode != null)
        {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.empty())
        {
            answerList.add(stack.pop());
        }
        return answerList;
    }

    public static void main(String[] args)
    {

        ArrayList<Integer> testList = new ArrayList<Integer>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);




    }
}
