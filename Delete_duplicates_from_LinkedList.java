//Function to delete duplicates from Linked List

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode current = head;
        ListNode prev = head;
        
       if(head == null || head.next == null)
       {
           return head;
       }
       
       while(current != null && current.next!=null)
       {
           if(current.val == current.next.val)
           {
               current.next = current.next.next;
           }
           else
           {
               current = current.next;
           }
       }
       return head;
        
    }
}