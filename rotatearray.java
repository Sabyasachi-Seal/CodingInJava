// https://leetcode.com/problems/rotate-array/
public class rotatearray {
    public void rotate(int[] nums, int k) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = nums[i];
        }
        for (int i = 0; i < ans.length; i++) {
            nums[(i+k)%nums.length] = ans[i];
        }
    }
}
