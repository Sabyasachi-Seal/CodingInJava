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
    public int[] findMode(TreeNode root) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        getFreq(root, hm);
        
        int maxFreq = 0;
        
        for(int k: hm.values()){
            maxFreq = Math.max(maxFreq, k);
        }
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int k: hm.keySet()){
            if(hm.get(k)==maxFreq){
                ans.add(k);
            }
        }
        
        int[] ret = new int[ans.size()];
        
        for(int i=0; i<ans.size(); i++){
            ret[i] = ans.get(i);
        }
        
        
        return ret;
        
    }
    private void getFreq(TreeNode root, HashMap<Integer, Integer> hm){
        if(root == null){
            return;
        }
        
        hm.put(root.val, hm.getOrDefault(root.val, 0)+1);
        
        getFreq(root.left, hm);
        getFreq(root.right, hm);
        
    }
}