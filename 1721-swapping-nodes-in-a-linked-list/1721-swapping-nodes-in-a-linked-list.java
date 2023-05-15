class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        // so we have to swap the kth and the length-kth node

        // if k is more than half the size of the array, then we have to loop around. so in this case we can add them up and then find the mod of them

        // find length
        
        int length = 0;
        ListNode temp = head; 
        while(temp != null){
            length++;
            temp = temp.next;
        }
        
        if(k > length/2){
            k = length-k+1;
        }
        
        int target = Math.min(length-k+1, length);
        
        System.out.println(length+" "+k+" "+target);
        
        // get the values of the 2 nodes
        temp = head;
        ListNode prev = null;
        int posi = 1;
        while(posi != k && temp!=null){
            posi++;
            prev = temp;
            temp = temp.next;
        }

        ListNode t1 = (temp == null)?prev:temp;
        int v1 = t1.val;

        while(posi != target && temp!=null){
            prev = temp;
            temp = temp.next;
            posi++;
        }

        temp = (temp == null)?prev:temp;

        int v2 = temp.val;
        temp.val = v1;
        t1.val = v2;

        return head;
    }
}