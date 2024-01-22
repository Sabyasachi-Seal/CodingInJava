class Solution {
    public int maxProduct(int[] nums) {
        
        int max = Integer.MIN_VALUE;
        
        int curr = 1;
        
        boolean isPosi = false;
        
        for(int i=0; i<nums.length; i++){
            curr = 1;
            
            if(nums[i]>=0) isPosi = true;
            
            max = Math.max(nums[i], max);
            
            for(int j=i; j<nums.length; j++){
                curr *= nums[j];
                max = Math.max(curr, max);
            }
        }
        
        if(!isPosi) return max;
        
        return max;
    }
}
// [2, 3, 4, 0]