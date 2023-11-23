class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        
        ArrayList<Boolean> ans = new ArrayList<>();
        
        for(int i=0; i<l.length; i++){
            
            int left = l[i];
            int right = r[i];
            
            if(right-left < 1) ans.add(false);
            
            else {
                
                int newArr[] = new int[right - left + 1];
                
                int ind = 0;
                
                for(int j=left; j<=right; j++){
                    newArr[ind++] = nums[j];
                }
                
                ans.add(getSeq(newArr));
                
            }
            
        }
        
        return ans;
    }
    
    private boolean getSeq(int[] nums){
        
        Arrays.sort(nums);
        
        int diff = nums[0] - nums[1];
        
        for(int i=1; i<nums.length-1; i++){
            
            if(nums[i]-nums[i+1] != diff){
                return false;
            }
            
        }
        
        return true;
        
    }
}