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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode cur=head;
        while(cur.next !=null){
            ListNode prev=cur.next; //will be new head
            cur.next=cur.next.next; //point next to next.next. because the next was prev 
            prev.next=head;         //connect prev and head
            head=prev;              //point prev next to be a new head
        }
        return head;
    }
}
