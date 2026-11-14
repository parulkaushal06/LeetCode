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
    public TreeNode solve(int[] preorder, int[] postorder, int start, int end) {
        if(start>end){
            return null;
        }
        TreeNode rootValue = new TreeNode(preorder[preIndex]);
        preIndex++;
        if (start == end) {
            return rootValue;
        }
        int left = preorder[preIndex];
        int index = start;
        while(left!= postorder[index]){
            index++;
        }
        rootValue.left= solve(preorder, postorder, start, index);
        rootValue.right= solve(preorder, postorder, index+1, end-1);
        return rootValue ;

    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return solve(preorder, postorder, 0, postorder.length-1);
    }
}