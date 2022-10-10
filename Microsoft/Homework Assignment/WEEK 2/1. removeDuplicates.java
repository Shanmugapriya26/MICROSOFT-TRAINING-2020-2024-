class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode node=head;
        if(head==null) return null;
        while(node.next!=null) {
            if(node.next.val==node.val) {
                node.next=node.next.next;
            }
            else{
                node=node.next;
            }
        }
        return head;
    }
}
