/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    
    ArrayList<ListNode> nodes;
    
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null){
            return null;
        }
        
        nodes = new ArrayList<>();
        
        ListNode temp = head;
        while(temp != null){
            nodes.add(temp);
            temp = temp.next;
        }
        
        return bst(null, 0, nodes.size()-1);
    }
    private TreeNode bst(TreeNode root, int start, int end){
        
        if(start <= end){
            
            int mid = (start+end)/2;
            
            root = new TreeNode(nodes.get(mid).val);
            
            root.left = bst(null, start, mid-1);
            
            root.right = bst(null, mid+1, end);
            
        }
        
        return root;
        
    }
}