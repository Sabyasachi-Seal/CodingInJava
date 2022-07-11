import java.util.*;
class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null) return new ArrayList<>();
        
        List<Integer> rights = rightnodes(root, new ArrayList<>(), 0);
        
        return rights;
    }
    public List<Integer> rightnodes(TreeNode root, List<Integer> ans1, int currlevel){
    
        if(root == null) return ans1;
        
        if(currlevel == ans1.size()) ans1.add(root.val);
        
        rightnodes (root.right, ans1, currlevel+1);
        
        rightnodes(root.left, ans1, currlevel+1);
        
        return ans1;
    }
}