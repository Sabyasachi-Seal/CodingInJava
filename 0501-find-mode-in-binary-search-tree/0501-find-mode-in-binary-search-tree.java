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
    
    ArrayList<TreeNode> freq = new ArrayList<>();
    
    int max = Integer.MIN_VALUE;
    int count = 1;
    TreeNode prev = null;
    
    public int[] findMode(TreeNode root) {
        
        getFreq(root);
        
        int ans[] = new int[freq.size()];
        
        for(int i=0; i<ans.length; i++){
            ans[i] = freq.get(i).val;
        }
        
        return ans;
        
    }
    private void getFreq(TreeNode root){
        
        if(root == null) return;
        
        getFreq(root.left);
        
        if(prev!=null){
            if(prev.val == root.val){
                count++;
            }
            else{
                count=1;
            }
        }
        
        if(count > max){
            freq.clear();
            freq.add(root);
            max = count;
        }
        else if(count == max){
            freq.add(root);
        }
        
        prev = root;
        
        getFreq(root.right);
        
    }
}