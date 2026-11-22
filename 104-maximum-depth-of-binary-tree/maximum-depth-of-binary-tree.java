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
    public int levelwise(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        int count = 0 ;
        if(root== null){
            return 0;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode rootval = queue.poll();
                
                if(rootval.left!= null){
                    queue.offer(rootval.left);
                }
                if(rootval.right!=null){
                    queue.offer(rootval.right);
                }
                
            }
            count ++ ;
        }
        return count ;
    }
    public int maxDepth(TreeNode root) {
        return levelwise(root);
    }
}