// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int arr[] = new int[nums.length];
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            count = 0;
            for(int j = 0; j<nums.length; j++){
                if(nums[i]>nums[j] && i!=j){
                    count++;
                }
            }
            arr[i] = count;
        }
        return arr;
    }
}