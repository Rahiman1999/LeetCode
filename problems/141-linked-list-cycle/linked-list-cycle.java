/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
              return false;
        }
        ListNode fastNode= head;
        ListNode slowNode = head;
        while(fastNode.next!=null&&fastNode.next.next!=null){
        fastNode=fastNode.next.next;
        slowNode=slowNode.next;
        if(fastNode==slowNode){
            return true;
        }
    }
        return false;
    }
}