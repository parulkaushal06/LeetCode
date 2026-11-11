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
    public int height(TreeNode root){
        if(root== null){
            return 0 ;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0 ;
        }
        int leftheight = height(root.left);
        int rightheight = height(root.right);
        int current_diameter = leftheight+rightheight ;
        int left_diameter = diameterOfBinaryTree(root.left);
        int right_diameter = diameterOfBinaryTree(root.right);
        return Math.max(current_diameter, Math.max(left_diameter, right_diameter));
    }
}