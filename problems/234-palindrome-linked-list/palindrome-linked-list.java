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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null&&fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr = slow.next;
        ListNode prev= null;
        while(curr!=null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev=curr;
            curr=temp;
        }

        ListNode mid = prev;
        while(mid!=null){
          if(head.val!=mid.val) return false;
          head=head.next;
          mid=mid.next;
    }
    return true;
}
}