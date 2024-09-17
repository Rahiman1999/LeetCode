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
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public ListNode mergeKLists(ListNode[] lists) {
    if(lists.length==0){
        return null;
    }
    for(int i=0;i<lists.length;i++){
        ListNode temp = lists[i];
        while(temp!=null){
            pq.add(temp.val);
            temp=temp.next;
        }
    }
    if(pq.isEmpty()) return null;
     ListNode root = new ListNode(pq.poll());
     ListNode temp = root;
     while(!pq.isEmpty()){
        temp.next = new ListNode(pq.poll());
        temp=temp.next;
     }
     
     return root;
        
    }
}