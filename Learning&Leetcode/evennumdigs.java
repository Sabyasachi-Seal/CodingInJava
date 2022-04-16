// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int num: nums){
            int size=0;
            while(num>0){
                num/=10;
                size++;
            }
            if((size&1)==0){
                ans++;
            }
        }
        return ans;
    }
}