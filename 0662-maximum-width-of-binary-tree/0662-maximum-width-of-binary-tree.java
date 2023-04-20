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

class qNode{
    
    TreeNode currNode;
    int currNum;
    int currLevel;
    
    qNode(TreeNode node, int ind, int level){
        currNode = node;
        currNum = ind;
        currLevel = level;
    }
    
    
}

class Solution {

    public int widthOfBinaryTree(TreeNode root) {
        
        return bfs(root);
    }
    private int bfs(TreeNode root){
        
        int index = 1;
        
        Queue<qNode> q = new LinkedList();
    
        q.add(new qNode(root, index, 0));
        
        int prevLevel = -1;
        
        int maxWidth = 0;
        
        int startNum = index;
        
        while(!q.isEmpty()){
            
            qNode curr = q.poll();
            
            TreeNode currNode = curr.currNode;
            int currNum = curr.currNum;
            int currLevel = curr.currLevel;
            
            if(currLevel != prevLevel){
                
                prevLevel = currLevel;
                
                startNum = currNum;
            }
            
            maxWidth = Math.max(maxWidth, currNum - startNum + 1);
            
            if(currNode.left!=null) q.offer(new qNode(currNode.left, 2*currNum, currLevel+1));
            if(currNode.right!=null) q.offer(new qNode(currNode.right, 2*currNum+1, currLevel+1));
            
        }
        return maxWidth;
        
    }
    
}