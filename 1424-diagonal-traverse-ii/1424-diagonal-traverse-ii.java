class Solution {
    public int[] findDiagonalOrder(List<List<Integer>> nums) {
        /// travel col first
        // travel row next
        
        int rows = nums.size();
        int cols = nums.get(0).size();
        
        int[] ans;
        
        int maxSum = 0;
        
        int totalEle = 0;
        
        HashMap<Integer, ArrayList<Integer>> sumToElements = new HashMap<>();
        
        for(int i=rows-1; i>=0; i--){
            
            for(int j=0; j< nums.get(i).size(); j++){
                
                maxSum = Math.max(maxSum, i+j);
                
                totalEle++;
                
                sumToElements.putIfAbsent(i+j, new ArrayList<>());
                
                sumToElements.get(i+j).add(nums.get(i).get(j));
                
            }
        }
        
        ans = new int[totalEle];
        
        int ind = 0;
        
        for(int i=0; i<=maxSum; i++){
            for(int e: sumToElements.get(i)){
                ans[ind] = e;
                ind++;
            }
        }
        
        return ans;
    }
}