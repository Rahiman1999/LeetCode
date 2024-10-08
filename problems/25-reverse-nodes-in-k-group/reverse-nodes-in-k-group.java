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
    public ListNode reverseKGroup(ListNode A, int B) {
        if(A==null) return A;
        int size=0;
        ListNode temp2=A;
        while(size<B&&temp2!=null){
            temp2=temp2.next;
            size+=1;
        }
        if(size!=B) return A;
        ListNode temp;
        ListNode h2=null;
        ListNode h3=A;
        int tempB = B;
        while(B>0&&A!=null){
            temp=A;
            A=A.next;
            temp.next=h2;
            h2=temp;
            B--;
        }
      h3.next=reverseKGroup(A,tempB);
      return h2;
    }
}