/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode cur=node;
        cur.val=cur.next.val;   //set current value is next value
        cur.next=cur.next.next;   //current next forward to next next
    }
}
