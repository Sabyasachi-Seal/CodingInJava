class Solution {
    public int minimizeArrayValue(int[] nums) {
        
        long sum = 0;
        
        int ans = Integer.MIN_VALUE;
        
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            ans = Math.max(ans, (int)Math.ceil((sum+i)/(i+1)));
            
        }
        
        return ans;
    }
}