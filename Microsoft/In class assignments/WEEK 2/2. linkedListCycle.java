public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode tort = head, hare = head;
        
        while(hare!=null && hare.next != null) {
            tort = tort.next;
            hare = hare.next.next;
            if(tort == hare)
                return true;
        }
        return false;
    }
}
