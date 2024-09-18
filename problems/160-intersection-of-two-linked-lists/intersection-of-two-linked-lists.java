/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     Set<ListNode> set = new HashSet<>();
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode temp1 = headA;
//         ListNode temp2 =  headB;
//         while(temp1!=null||temp2!=null){
//             if(temp1!=null){
//                if(set.contains(temp1)){
//                 return temp1;
//                }else{
//                 set.add(temp1);
//                 temp1= temp1.next;
//                }
//             }
//             if(temp2!=null){
//                if(set.contains(temp2)){
//                 return temp2;
//                }else{
//                 set.add(temp2);
//                 temp2= temp2.next;
//                }
//             }
//         }

//         return temp1;
//     }
// }
public class Solution {
    public ListNode getIntersectionNode(ListNode head1, ListNode head2) {
     if(head1 == null || head2 == null)
            return null;

        // means both heads are pointing to the same lists
        if(head1 == head2)
            return head1;

        ListNode tempHead1 = head1;
        ListNode tempHead2 = head2;

        // STEP-1 : get length of both the lists
        int length1 = length(tempHead1);
        int length2 = length(tempHead2);

        // STEP-2 : forward the bigger list head diff times
        if(length1 > length2) {
            int diff = length1 - length2;
            while(diff != 0){
                tempHead1 = tempHead1.next;
                diff--;
            }
        } else{
            int diff = length2 - length1;
            while(diff != 0){
                tempHead2 = tempHead2.next;
                diff--;
            }
        }

        // STEP-3 : forward both head till they meet
        while(tempHead1 != tempHead2) {
            tempHead1 = tempHead1.next;
            tempHead2 = tempHead2.next;
        }
        return tempHead1;
    }

    public int length(ListNode head){
        int length = 0;
        while(head != null){
            ++length;
            head = head.next;
        }
        return length;
    }
}