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
    TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> tree;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        // use the concept of maxShift
        
        tree = new TreeMap<>();
        
        preorder(root, 0, 0);
        
        List<List<Integer>> ans = new ArrayList<>();
        
        System.out.println(Arrays.asList(tree));
        
        
        for(TreeMap<Integer, PriorityQueue<Integer>> t: tree.values()){
            
            List<Integer> tempans = new ArrayList<>();
            
            for(int key: t.keySet()){

                while(!t.get(key).isEmpty()){
                       tempans.add(t.get(key).poll());
                }

            }
            
            ans.add(tempans); 
        }
        
        return ans;
    }
    private TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> preorder(TreeNode root, int currShift, int level){
        
        if(root == null){
            return tree;
        }
        
        if(!tree.containsKey(currShift)){
            tree.put(currShift, new TreeMap<>());
        }
        
        if(!tree.get(currShift).containsKey(level)){
            tree.get(currShift).put(level, new PriorityQueue<>());
        }
        
        tree.get(currShift).get(level).offer(root.val);
        
        preorder(root.left, currShift-1, level+1);
        preorder(root.right, currShift+1, level+1);
        
        
        return tree;
    }
}