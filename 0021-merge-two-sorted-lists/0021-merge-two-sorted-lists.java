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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = l1;
        // compare the two elements 
        ListNode prev = null;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                prev = l1;
                l1 = l1.next;
            }
            else{
                
                if(prev != null) prev.next = l2;
                else head = l2;
                
                ListNode temp = l2.next;
                
                l2.next = l1;
                
                prev = l2;
                
                l2 = temp;
                
            }
        }
        
        if(l2!=null){
            if(prev == null) head = l2;
            else prev.next = l2;
        }
        
        if(l1!=null){
            if(prev == null) head = l1;
            else prev.next = l1;
            // prev.next = l1;
        }
        
        return head;
    }
}