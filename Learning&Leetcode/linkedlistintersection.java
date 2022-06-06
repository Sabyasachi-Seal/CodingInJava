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
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    //     if(headA==null || headB==null) return null;
    //     ListNode t1=headA, t2=headB;
    //     while(t2!=null){
    //         t1 = headA;
    //         while(t1!=null){
    //             if(t1!=t2){
    //                 t1 = t1.next;
    //             }
    //             else{
    //                 return t1;
    //             }
    //         }
    //         t2 = t2.next;
    //     }
    //     return null;
    // }
    // public ListNode getIntersectionNode(ListNode headA, ListNode headB){
    //     if(headA==null || headB==null) return null;
    //     Hashtable<ListNode, Integer> ht = new Hashtable<>();
    //     ListNode t1=headA, t2=headB;
    //     while(t1!=null){
    //         ht.put(t1, t1.val);
    //         t1 = t1.next;
    //     }
    //     while(t2!=null){
    //         if(ht.getOrDefault(t2, 0)>0){
    //             return t2;
    //         }
    //         t2=t2.next;
    //     }
    //     return null;
    // }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int l1 = 0, l2 = 0;
        ListNode t1=headA, t2=headB;
        while(t1!=null){
            l1++;
            t1=t1.next;
        }
        while(t2!=null){
            l2++;
            t2 = t2.next;
        }
        t1 = (l1>l2)?headA:headB;
        t2 = (l1<l2)?headA:headB;
        for (int i = 0; i < Math.abs(l1-l2); i++) {
            t1 = t1.next;
        }
        while(t1!=null && t2!=null){
            if(t1==t2){
                return t1;
            }
            else{
                t1 = t1.next;
                t2 = t2.next;
            }
        }
        return null;
    }
}
