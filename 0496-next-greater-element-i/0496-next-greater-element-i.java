class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // first do it for nums2
        
        int greatest = nums2[0];
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        // what if the immediate next is not larger but a one further is larger?
        
        // we can add such elements to some ds and then use them to get higest for each
        
        int ans[] = new int[nums1.length];
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i=1; i<nums2.length; i++){
            
            if(nums2[i]>greatest){
                
                hm.put(nums2[i-1], nums2[i]);
                
                greatest = nums2[i];
            }
            
            else{
                pq.offer(nums2[i-1]);
            }
            
            while(!pq.isEmpty()){
                if(pq.peek() < nums2[i]){
                    hm.put(pq.poll(), nums2[i]);
                }
                else break;
            }

        }
        
        for(int i=0; i<ans.length; i++){
            if(hm.containsKey(nums1[i])){
                ans[i] = hm.get(nums1[i]);
            }
            else ans[i] = -1;
        }
        
        return ans;
    }
}