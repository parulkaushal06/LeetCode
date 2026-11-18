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
    public void solve(TreeNode root, ArrayList<Integer> li){
        if(root == null){
            return ;
        }
        solve(root.left, li);
        li.add(root.val);
        solve(root.right, li);
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return false ;
        }
        ArrayList<Integer> li = new ArrayList<>();
        solve(root, li);
        for(int i=1; i<li.size(); i++){
            if(li.get(i)<= li.get(i-1)){
                return false ;
            }
        }
        return true ;
    }
}