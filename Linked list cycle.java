//Linked list cycle

public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode slow=head,fast=head;
        
        while(fast!=null && fast.next!=null && slow!=null){
            
            slow=slow.next;
            fast=fast.next.next;
            
            if(slow==fast) return true; //if you found link 
            
        }
        return false;
    }
}