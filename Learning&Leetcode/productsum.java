// https://leetcode.com/problems/product-of-array-except-self/
class productsum{
    // public int[] productExceptSelf(int[] nums) {
    //     int[] ans = new int[nums.length];
    //     for (int i = 0; i < ans.length; i++) {
    //         findprod(ans, nums, i);
    //     }
    //     return ans;
    // }
    // public void findprod(int[] ans, int[] nums, int skip){
    //     ans[skip] = 1;
    //     for (int i = 0; i < nums.length; i++) {
    //         if(i!=skip) ans[skip] *= nums[i];
    //     }
    // }
    // public int[] productExceptSelf(int[] nums) {
    //     int[] ans = new int[nums.length];
    //     int prod = 1;
    //     for (int i = 0; i < ans.length; i++) {
    //         prod *= nums[i];
    //     }
    //     for (int i = 0; i < ans.length; i++) {
    //         if(nums[i] != 0) ans[i] = prod/nums[i];
    //         else{
    //             ans[i] = 1;
    //             for (int j = 0; j < ans.length; j++) {
    //                 if(i!=j) ans[i] *= nums[j];
    //             }
    //         } 
    //     }
    //     return ans;
    // }
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = nums[0];
        for (int i = 1; i < right.length; i++) {
            left[i] = left[i-1] * nums[i+1];
        }
        right[right.length-1] = nums[nums.length-1];
        for (int i = right.length-2; i >= 0; i--) {
            right[i] = right[i+1] * nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = left[i] * right[i];
        }
        return nums;
    }
}