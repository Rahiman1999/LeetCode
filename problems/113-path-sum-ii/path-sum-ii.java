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
    List<List<Integer>> subsetAll = new ArrayList<>();
    List<Integer> subset = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        sum(root,targetSum);
        return subsetAll;
    }
    public void sum(TreeNode root,int target){
        if(root==null) return;
        subset.add(root.val);
        if((root.left==null&&root.right==null)&&root.val==target){
            subsetAll.add(new ArrayList<>(subset));
        }
        sum(root.left,target-root.val);
        sum(root.right,target-root.val);
        subset.remove(subset.size()-1);
    }
}