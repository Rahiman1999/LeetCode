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
    int ans=0;
    List<Integer> values = new ArrayList<>();
    public int pathSum(TreeNode root, int targetSum) {
        path(root,targetSum);
        return ans;
    }
    public void path(TreeNode root, int target){
        if(root==null) return;
        values.add(root.val);
        path(root.left,target);
        path(root.right,target);

        long temp=0;
        for(int i=values.size()-1;i>=0;i--){
            temp+=values.get(i);
            if(temp==target){
                ans++;
            }
        }
        values.remove(values.size()-1);
    }
}