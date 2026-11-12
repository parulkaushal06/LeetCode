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
    public void solve(TreeNode root, int targetSum, List<Integer> li, List<List<Integer>> result){
        if(root == null){
            return ;
        }
        li.add(root.val);
        targetSum = targetSum - root.val;
        if(root.left == null && root.right == null){
            if(targetSum == 0){
                result.add(new ArrayList<>(li));    
            }
            li.remove(li.size()-1);
            return ;
        }
        solve(root.left, targetSum, li, result);
        solve(root.right, targetSum, li, result);
        li.remove(li.size()-1);

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> li = new ArrayList<>();
        solve(root, targetSum, li, result);
        return result ;
    }
}