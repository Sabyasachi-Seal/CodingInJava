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
    public boolean isSymmetric(TreeNode root) { 
        
        if(root.left == null && root.right==null) return true;
        else if(root.left == null || root.right == null) return false;
        
        return check(root.left, root.right) && root.left.val==root.right.val;
        
    }
    private boolean check(TreeNode left, TreeNode right){
        
        if(left == null && right == null){
            return true;
        }
        
        if(left == null || right == null){
            return false;
        }
        
        if(left.left != null && right.right!= null && left.left.val != right.right.val){
            return false;
        }
        
        else if(left.right != null && right.left != null && left.right.val != right.left.val){
            return false;
        }
        
        // System.out.println(left.val+" "+right.val);
        
        return check(left.left, right.right) && check(left.right, right.left);
    }
}