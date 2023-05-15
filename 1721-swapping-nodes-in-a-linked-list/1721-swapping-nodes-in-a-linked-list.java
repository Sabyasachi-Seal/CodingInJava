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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode l = head, r = head;
        
        for(int i=1; i<k; i++) l = l.next;
        
        ListNode curr = l;
        while(curr.next != null){
            curr = curr.next;
            r = r.next;    
        }
        
        int t = l.val;
        l.val = r.val;
        r.val = t;            
        
        return head;
    }
}