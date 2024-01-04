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
    public ListNode sortList(ListNode A) {
        if(A==null||A.next==null) return A;
        ListNode ans = mergeSort(A);
        return ans;
    }
    public static ListNode mergeSort(ListNode A){
        if(A.next==null) return A;
        ListNode intesection = center(A);
        ListNode h2= intesection.next;
        intesection.next=null;
        A=mergeSort(A);
        h2=mergeSort(h2);
        return merge(A,h2);
    }
    public static ListNode center(ListNode A){
        ListNode fastNode= A;
        ListNode slowNode=A;
        while(fastNode.next!=null&&fastNode.next.next!=null){
            fastNode=fastNode.next.next;
            slowNode=slowNode.next;
        }
        return slowNode;
    }

    public static ListNode merge(ListNode h1, ListNode h2){
        if(h2==null){
            return h1;
        }
        if(h1==null){
            return h2;
        }
        ListNode l;
        if(h1.val<h2.val){
            l=h1;h1=h1.next;
        }else{
            l=h2;h2=h2.next;
        }
        ListNode temp=l;
        while(h1!=null&&h2!=null){
           if(h1.val<h2.val){
               temp.next=h1;
               h1=h1.next;
               temp=temp.next;
           }else{
               temp.next=h2;
               h2=h2.next;
               temp=temp.next;
           }
        }
        if(h1!=null){
            temp.next=h1;
        }
        if(h2!=null){
            temp.next=h2;
        }
        return l;
    }
}