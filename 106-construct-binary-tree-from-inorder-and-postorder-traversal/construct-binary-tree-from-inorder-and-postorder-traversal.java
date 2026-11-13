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
    int postIndex ;
    public TreeNode solve(int[]inorder, int[]postorder, int start, int end){
        if(start>end){
            return null ;
        }
        TreeNode rootValue = new TreeNode(postorder[postIndex]);
        postIndex--;
        int index = start ;
        while(inorder[index]!=rootValue.val){
            index++;
        }
        rootValue.right = solve(inorder, postorder, index+1, end);
        rootValue.left = solve(inorder, postorder, start, index-1);
        return rootValue ;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length-1;
        return solve(inorder, postorder, 0, inorder.length-1);
    }
}