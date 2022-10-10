class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return null;
        if(head.next==null && n==1) return null;
        
        int length=0;
        ListNode x=head;
        while(x!=null) {
            length++;
            x=x.next;
        }
        ListNode m=null;
        ListNode k=head;
        int count=0;
        while(k!=null) {
            if(count==length-n) {
                if(count==0) {
                    head=k.next;
                    return head;
                }
                m.next=k.next;
                k.next=null;
                return head;
            }
            count++;
            m=k;
            k=k.next;
        }
        return head;
    }
}
