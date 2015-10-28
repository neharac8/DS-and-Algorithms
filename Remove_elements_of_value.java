//Function to remove elements from the linkedlist of a particular value
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        
       if(head == null)
        {
            return head;
        }
        
        while(head!=null && head.val == val)
        {
            head = head.next;
        }
        
        
        
        ListNode current = head;
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode prev = current;
        
        while(current != null)
        {
            if(current.val == val)
            {
                prev.next = current.next;
                current = current.next;
            }
            else
            {
                prev = current;
                current = current.next;
            }
        }
        
        return head;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}