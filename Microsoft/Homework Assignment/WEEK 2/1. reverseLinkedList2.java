class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null) {
            return head;
        }
        if(left==right) return head;
        int l=1,r=1;
        int h=0,flag=0,s=0;
        if(left!=l) {
            h=1;
        }
        ListNode p=null;
        ListNode q=head;
        ListNode r=head.next;
        ListNode ps=null;
        ListNode s=null;
       
        do {
            if(flag==0 && l==left) {
                if(h==1) ps=p;
                s=q;
                flag=1;
                p=q;
                q=r;
                r=r.next;
            } else if(flag==1) {
                if(r==right) {
                    s=1;
                    q.next=p;
                }
                else {
                    q.next=p;
                    p=q;
                    q=r;
                    r=r.next;
                }    
            } else {
                p=q;
                q=r;
                r=r.next;
            }
            l++;
            r++;
            if(s==0 && r==right){
                if(h==1) ps.next=q;
                s.next=q.next;
            }
        } while(sam==0);
        if(h==0) return q;
        return head;
    }
}
