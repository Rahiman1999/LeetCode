/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        Queue<TreeNode> qu = new LinkedList<>();
        qu.add(root);
        while(!qu.isEmpty()){
            int size = qu.size();
            long sum=0;
            for(int i=0;i<size;i++){
                TreeNode temp = qu.poll();
                if(temp!=null){
                    sum+=temp.val;
                }
                if(temp.left!=null){
                    qu.add(temp.left);
                }
                if(temp.right!=null){
                    qu.add(temp.right);
                }
            }
            pq.add(sum);
        }
        
        int size = pq.size();
        if(k>size) return -1;
       for(int i=0;i<size-k;i++){
         pq.poll();
       }
       
      return pq.peek();
        
    }
}