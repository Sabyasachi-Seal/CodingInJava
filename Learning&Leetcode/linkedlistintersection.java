// https://leetcode.com/problems/intersection-of-two-linked-lists/
import  java.util.*;
public class linkedlistintersection {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null || headB==null) return null;
        ListNode t1=headA, t2=headB;
        while(t2!=null){
            t1 = headA;
            while(t1!=null){
                if(t1!=t2){
                    t1 = t1.next;
                }
                else{
                    return t1;
                }
            }
            t2 = t2.next;
        }
        return null;
    }
}
