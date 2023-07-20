class Solution {
    public int majorityElement(int[] nums) {
        
        int maxEle = nums[0];
        int maxEleFreq = 1;
        
        for(int i: nums){
            if (i == maxEle){
                maxEleFreq++;
            }
            else{
                maxEleFreq--;
                if(maxEleFreq == 0){
                    maxEle = i;
                    maxEleFreq = 1;
                }
            }
        }
        
        return maxEle;
        
    }
}