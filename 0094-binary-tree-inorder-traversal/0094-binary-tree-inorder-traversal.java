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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        return inorder(root, new ArrayList<>());
        
        
    }
    private List<Integer> inorder(TreeNode root, List<Integer> ans){
        
        while(root != null){
            
            if(root.left == null){
                ans.add(root.val);
                root = root.right;
            }
            else{
                
                TreeNode prev = root.left;
                while(prev.right!=null && prev.right!=root){
                    prev = prev.right;
                }
                if(prev.right==null){
                    prev.right = root;
                    root = root.left;
                }
                else{
                    prev.right = null;
                    ans.add(root.val);
                    root = root.right;
                }
                
            }
            
        }
        return ans;
    }
}