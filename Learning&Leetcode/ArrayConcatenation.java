/*https://leetcode.com/problems/concatenation-of-array/submissions/*/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[(nums.length) * 2]; 
        for(int i=0; i<ans.length; i++){
            ans[i] = nums[i%nums.length];
        }
        return ans;
    }
}