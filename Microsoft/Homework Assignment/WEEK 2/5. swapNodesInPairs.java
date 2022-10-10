class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null) {
            return null;
        }
        if(head.next==null) {
            return head;
        }
        ListNode m=head;
        ListNode n=head.next;
        ListNode p=head.next.next;
        if(p==null) {
            m.next=null;
            n.next=m;
            return n;
        }
        head=n;
        while(m!=null && m.next!=null) {
            if(n.next==null) {
                m.next=null;
            }
            else if(n.next.next==null) {
                m.next=p;
            }
            else {
                m.next=n.next.next;
            }
            n.next=m;
            if(m==null || m.next==null) {
                return head;
            }
            m=p;
            if(m.next!=null) p=m.next.next;
            if(m!=null) n=m.next;
        }
        return head;
    }
}
