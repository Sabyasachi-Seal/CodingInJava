// https://leetcode.com/problems/product-of-array-except-self/
class productsum{
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            findprod(ans, nums, i);
        }
        return ans;
    }
    public void findprod(int[] ans, int[] nums, int skip){
        ans[skip] = 1;
        for (int i = 0; i < nums.length; i++) {
            if(i!=skip) ans[skip] *= nums[i];
        }
    }
}