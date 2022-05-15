import java.util.*;

public class reverseBetween {
    public class ListNode
    {
        int val;
        ListNode next =null;

        ListNode(int val)
        {
            this.val = val;
        }
    }

    public static void main(String[] args)
    {
        //ListNode node0 = new ListNode(1);
    }

    public ListNode reverseBetweenMethod(ListNode Head, int m, int n)
    {
        ListNode dummyNode = new ListNode(-1);

        dummyNode.next = Head;
        ListNode pre = dummyNode;
        for(int i = 0;i < m - 1;i ++){
            //用于找到翻转区间的前一个节点
            pre = pre.next;
        }
        ListNode cur = pre.next;
        for(int i = m; i < n; ++i){
            //头插法翻转
            ListNode cur_next = cur.next;
            ListNode pre_next = pre.next;

            pre.next = cur;
            cur.next = pre_next;
            cur = cur_next;
        }
        return dummyNode.next;

    }

    private ListNode reverseNode(ListNode Head)
    {
        ListNode pre = null;
        ListNode cur = Head;
        while(cur !=null)
        {
            ListNode cur_next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = cur_next;
        }
        return  pre;
    }

}
