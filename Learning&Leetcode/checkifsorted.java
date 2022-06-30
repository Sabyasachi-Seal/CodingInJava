// https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1/
public class checkifsorted {
    boolean arraySortedOrNot(int[] nums, int n) {
        if(n<2) return true;
        else if (nums[n-1]>=nums[n-2]) return arraySortedOrNot(nums, n-1);
        else return false;
    }
}
