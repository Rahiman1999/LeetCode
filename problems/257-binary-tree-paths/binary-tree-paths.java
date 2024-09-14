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
    List<String> ans = new ArrayList<>();
    
    public List<String> binaryTreePaths(TreeNode root) {
        String node="";
        preOrder(root,node);
        return ans;
    }
    public void preOrder(TreeNode root,String node){
        if(root==null) return;
        if(root.left==null&&root.right==null){
            node+=root.val+"";
            ans.add(node);
            return;
        }
        node+=root.val+"->";
        
        preOrder(root.left,node);
        preOrder(root.right,node);
    }
}