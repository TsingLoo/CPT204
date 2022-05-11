public class deleteNode {
    public ListNode deleteNodeMethod (ListNode head, int val) {
        ListNode res = new ListNode(0);
        res = head;

        if(head.val == val)
        {
            res = head.next;
        }

        while(head.next!=null)
        {
            if(val == head.next.val)
            {
                head.next = head.next.next;
            }

            head = head.next;
        }

        return res;
        // write code here
    }

}
