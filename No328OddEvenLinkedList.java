/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode odd=new ListNode(head.val);
        ListNode oddT=odd;
        ListNode even=new ListNode(head.next.val);
        ListNode evenT=even;
        ListNode tmp=head.next;
        int count=1;
        while(tmp!=null && tmp.next!=null){
            ListNode next=new ListNode(tmp.next.val);
            if(count%2==0){
                evenT.next=next;
                evenT=evenT.next;
            }
            else{
                oddT.next=next;
                oddT=oddT.next;
            }
            count++;
            tmp=tmp.next;
        }
        oddT.next=even;
        return odd;
    }
}
