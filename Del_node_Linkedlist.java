//Function to delete node from Linked list

public class Solution {
    public void deleteNode(ListNode node) {
        
        node.val = node.next.val;
        
        if(node.next == null)
        {
            System.out.println("Cannot delete tail node");
            return;
        }
        if(node.next.next == null)
        {
            node.next = null;
            return;
        }
       
       node = node.next;
        deleteNode(node);
       
        
        
    }
}