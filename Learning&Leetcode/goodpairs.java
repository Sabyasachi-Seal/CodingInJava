class Solution {
    public int numIdenticalPairs(int[] nums) {
        int pairs = 0;
        for(int j = 0; j<nums.length; j++){
            for(int i=0; i<j; i++){
                if(nums[i] == nums[j]){
                    pairs++;
                }
            }
        }
        return pairs;
    }
}