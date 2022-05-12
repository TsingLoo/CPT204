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

      if(list1.val<= list2.val)
      {
          list1.next = Merge(list1.next ,list2);
          return  list1;
      }else
      {
          list2.next = Merge(list2.next,list2);
          return  list2;
      }


    }
}
