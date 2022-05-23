public class FindFirstCommonNod {
    public class ListNode
    {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode FindFirstCommonNodeMethod(ListNode pHead1,ListNode pHead2)
    {
        ListNode p1 = new ListNode(0);
        ListNode p2 = new ListNode(0);

        p1 = pHead1;
        p2 = pHead2;

        while (p1 != p2)
        {
            if(p1 == null)
            {
                p1 = pHead2;
            }else
            {
                p1 = p1.next;
            }

            if(p2 == null)
            {
                p2 = pHead1;
            }else
            {
                p2 = p2.next;
            }
        }

        return p1;
    }


}
