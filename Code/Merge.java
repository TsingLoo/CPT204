import java.util.List;

public class Merge {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {

        if(list1 == null || list2 == null)
        {
            return  list1 != null? list1: list2;
        }

        ListNode result = new ListNode(0);
        ListNode head = result;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<= list2.val)
            {
                result.next = list1;
                list1 = list1.next;
                result = result.next;
            }else
            {
                result.next = list2;
                list2 = list2.next;
                result = result.next;
            }
        }

        if(list1!=null)
        {
            result.next = list1;
        }else
        {
            result.next = list2;
        }

        //result.next = list2;
        return  head.next;

    }
}
