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
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode cur = listNode;
        ListNode HeadNode = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = HeadNode;
            HeadNode = cur;
            cur = temp;
        }
        while (HeadNode != null)
        {
            list.add(HeadNode.val);
            HeadNode = HeadNode.next;
        }
        return list;
    }

    public static void main(String[] args)
    {

        ArrayList<Integer> testList = new ArrayList<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.add(4);

    }
}
