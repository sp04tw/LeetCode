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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if( list1==null && list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode result=null,resultT=null;
        ListNode T1=list1,T2=list2;
        if(T1.val<T2.val){
            result=new ListNode(T1.val);
            T1=T1.next;
        }
        else{
            result=new ListNode(T2.val);
            T2=T2.next;
        }
        resultT=result;
        while(T1!=null && T2!=null){
            if(T1.val>T2.val){
                resultT.next=T2;
                resultT=resultT.next;
                T2=T2.next;
            }
            else{
                resultT.next=T1;
                resultT=resultT.next;
                T1=T1.next;
            }
        }
        resultT.next=T1!=null?T1:T2;
        return result;
    }
}
