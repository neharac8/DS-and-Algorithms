//Function to reverse the linked list

public class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode p1= head;
        
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode p2= p1.next;
        ListNode p3 = p2.next;
        p1.next = null;
        p2.next = p1;
        //only two nodes
        if(p3 == null)
        {
            return p2;
        }
        while(p2 != null)
        {
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            if(p3!=null)
            {
            p3 = p3.next;
            }
        }
        
        return p1;
    }
}