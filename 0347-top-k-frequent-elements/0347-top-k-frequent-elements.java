class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // I have to give K number of elements whose freqency was higest
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->a[0]==b[0]?b[1]-a[1]:b[0]-a[0]);
        
        // how about i store the max freq of every element
        
        for(int i: nums){
            
            hm.put(i, hm.getOrDefault(i, 0)+1);
            
        }
        
        // now i have the frequency of every element in hm. I can put them in a pq to be sorted
        // i could also use a treemap in the same way
        
        for(int key: hm.keySet()){
            pq.add(new int[]{hm.get(key), key}); // freq,ele
        }
        
        int ans[] = new int[k];
        int ind = 0;
        
        while(ind<ans.length){
            ans[ind++] = pq.poll()[1];
        }

        return ans;
        
    }
}