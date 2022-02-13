class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode slow=head,fast=head.next;        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        //when fast pointer is null, slow pointer is just at middle
        ListNode mid=slow.next; 
        slow.next=null; //cut
        return merge(sortList(head),sortList(mid));
    }
    
    private ListNode merge(ListNode left, ListNode right){
        ListNode stack =new ListNode(0);
        ListNode tail=stack;
        while(left!=null && right!=null){
            if(left.val>right.val){
                ListNode tmp=left;
                left=right;
                right=tmp;
            }
            tail.next=left;//tail next connect to left
            left=left.next;//point to next
            tail=tail.next;//tail point to next, next loop will connect from this point
        }
        tail.next=left==null?right:left;//if left is null, it's mean, tail next will connect with right
        return stack.next;
    }
}
