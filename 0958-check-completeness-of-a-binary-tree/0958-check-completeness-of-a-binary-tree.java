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
    public boolean isCompleteTree(TreeNode root) {
        
        // there can be a condition where a level is not full but stil has a child
        // do a level order traversal. check if a -1 comes at any point
        
        return checkTree(root);
    }
    private boolean checkTree(TreeNode root){
        
        boolean nullFound = false;    
        
       Queue<TreeNode> nodes = new LinkedList<>();
        
        nodes.offer(root);
        
        while(!nodes.isEmpty()){
            
            TreeNode curr = nodes.poll();
            
            if(curr == null){
                nullFound = true;   
            }
            else{
                
                if (nullFound) return false;
                
                nodes.offer(curr.left);
                nodes.offer(curr.right);
            }
            
        }
        return true;
        
    }
}