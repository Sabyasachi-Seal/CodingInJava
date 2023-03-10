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
class Solution {
    private ArrayList<ListNode> nodes = new ArrayList<>();
    
    private int size = 0;
    
    public Solution(ListNode head) {
        ListNode temp = head;
        while(temp!=null){
            nodes.add(temp);
            temp = temp.next;
        }
        size = nodes.size();
    }
    
    public int getRandom() {
        return nodes.get((int)(Math.random() * size)).val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */