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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode tmp=head;
        while(tmp!=null){
            count++;
            tmp=tmp.next;
        }
        count=count-n;
        tmp=head;
        while(count>1){
            tmp=tmp.next;
            count--;
        }
        
        if(count==0) {
            head=head.next;
        }
        else if(count>0){
            tmp.next=tmp.next.next;
        }
        else tmp.next=null;
        return head;
    }
}
