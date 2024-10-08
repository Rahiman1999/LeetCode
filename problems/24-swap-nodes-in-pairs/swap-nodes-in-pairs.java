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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        ListNode temp;
        ListNode h2=null;
        ListNode h3 = head;
        int B=2;
        while(B>0&&head!=null){
             temp= head;
             head=head.next;
             temp.next=h2;
             h2=temp;
             B--;
        }
        h3.next = swapPairs(head);
        return h2;
    }
}