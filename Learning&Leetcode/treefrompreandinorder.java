import java.util.*;
//https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class treefrompreandinorder {
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> ind = new HashMap<>();
        for(int i=0; i<inorder.length; i++){
            ind.put(inorder[i], i);
        }

        TreeNode root = tree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, ind);

        return root;
    }
    public TreeNode tree(int[] preorder, int prestart, int preend, int[] inorder, int instart, int inend, HashMap<Integer, Integer> ind){
        if(prestart>preend || instart>inend){
            return null;
        }
        TreeNode root = new TreeNode(preorder[prestart]);
        int inroot = ind.get(root.val);
        int leftnums = inroot - instart;

        root.left = tree(preorder, prestart+1, prestart+leftnums, inorder, instart, inroot-1, ind);

        root.right = tree(preorder, prestart+leftnums+1, preend, inorder, inroot+1, inend, ind);

        return root;

    } 
}
