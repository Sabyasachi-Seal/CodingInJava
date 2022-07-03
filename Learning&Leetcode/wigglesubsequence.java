// https://leetcode.com/problems/wiggle-subsequence/
public class wigglesubsequence {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length == 1 ) return 1;
        int i = 0;
        int posinegi = 0;
        int count = 0;
        while(i<nums.length-1){
            if(nums[i]-nums[i+1] != 0){ 
                posinegi = (nums[i] - nums[i+1])/Math.abs(nums[i] - nums[i+1]);
                break;
            }
            else{
                count++;
                i++;
            }
        }
        if (posinegi == 0) return 1;
        for (;i<nums.length-1; i++) {
            if((nums[i] - nums[i+1] == 0)) count++;
            else if((nums[i] - nums[i+1])/Math.abs(nums[i] - nums[i+1]) != posinegi) count++;
            else posinegi *= -1;
        }
        return nums.length-count;
    }
}
