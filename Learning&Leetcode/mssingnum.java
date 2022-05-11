public class mssingnum {
    // public int missingNumber(int[] nums) {
    //     int sum = 0;
    //     for (int i : nums) {
    //         sum += i;
    //     }        
    //     return ((nums.length)*(nums.length+1)/2) - sum;
    // }
    public int missingNumber(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ i;
            res = res ^ nums[i];
        }
        return res;
    }
}
