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
    public int maxLevelSum(TreeNode root) {
        int sum=Integer.MIN_VALUE;
        int level=0;
        int finalLevel=0;
        if(root == null){
            return 0;
        }
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        qu.add(root);
        while(!qu.isEmpty()){
            level++;
            int count = qu.size();
            int sum1=0;
            while(count != 0){
               TreeNode node = qu.poll();
               if(node!=null){
                   sum1+=node.val;
               }
               if(node.left!=null)
               qu.add(node.left);
               if(node.right!=null)
               qu.add(node.right);
               count--;
            }
            // System.out.print(sum1+" ");
            if(sum1>sum){
                sum=sum1;
               finalLevel=level;
            }
        }
        return finalLevel;
    }
}