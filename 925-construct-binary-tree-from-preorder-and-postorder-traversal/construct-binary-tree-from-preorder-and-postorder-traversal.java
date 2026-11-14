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
    public TreeNode solve(int[] preorder, int[] postorder, int start , int end) {
        if(start>end){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIndex]);
        preIndex++;
        if(start==end){
            return root;
        }
        int rootLeft = preorder[preIndex];
        int index = start ;
        while(rootLeft != postorder[index]){
            index++;
        }
        root.left = solve(preorder, postorder, start, index);
        root.right = solve(preorder, postorder, index+1, end-1);
        return root ;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return solve(preorder, postorder, 0, postorder.length-1);
    }
}