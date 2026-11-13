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
    int preIndex = 0;
    public TreeNode solve(int[]preorder, int[]inorder, int start, int end){
        if(start>end){
            return null ;
        }
        TreeNode rootval = new TreeNode(preorder[preIndex]);
        preIndex++;
        int index = start ;
        while(inorder[index]!=rootval.val){
            index++;
        }
        rootval.left = solve(preorder, inorder, start, index-1);
        rootval.right = solve(preorder, inorder, index+1, end);
        return rootval ;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return solve(preorder, inorder, 0, inorder.length-1);
        
    }
}