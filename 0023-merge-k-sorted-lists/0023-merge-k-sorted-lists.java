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
    public ListNode mergeKLists(ListNode[] lists) {
        // use merge sort for all lists
        // each list is an element
        
        // return mergeSortList(0, lists.length-1, lists);
        
        if(lists.length < 1) return null;
        
        ListNode l1 = lists[0];
        
        for(int i=1; i<lists.length; i++){
            
            l1 = mergeList(l1, lists[i]);
            
        }
        
        return l1;
    }
    private ListNode mergeSortList(int start, int end, ListNode[] lists){
        if(start<=end){
            int mid = start + (end-start)/2;
            
            ListNode l1 = mergeSortList(0, mid-1, lists);
            ListNode l2 = mergeSortList(mid+1, end, lists);
            
            return mergeList(l1, l2);
        }
        return null;
    }
    private ListNode mergeList(ListNode l1, ListNode l2){
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
        }
        
        return head; 
        
    }
}