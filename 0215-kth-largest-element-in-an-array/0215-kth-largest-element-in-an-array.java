class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i: nums) pq.offer(i);
    
        while(k>1){
            pq.poll();
            k--;
        }

        return pq.peek();

    }

}