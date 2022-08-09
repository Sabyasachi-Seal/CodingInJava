import java.util.*;
class longestincreasingsubsequence{
    public static void main(String[] args) {
        longestincreasingsubsequence o = new longestincreasingsubsequence();
        int []arr = {0,3,1,6,2,2,7};
        System.out.println(o.lengthOfLIS(arr));
        // System.out.println(max);
    }
    int dp[][];
    public int lengthOfLIS(int[] nums) {
        dp = new int[nums.length][nums.length+1];
        for(int i=0; i<nums.length; i++){
            Arrays.fill(dp[i], -1);    
        }
        return subs(nums, 0, -1)-1;
    }
    private int subs(int arr[], int i, int prev){
        if(i == arr.length){
            return 1;
        }
        if (dp[i][prev+1] != -1) return dp[i][prev+1];
        int length = 0 + subs(arr, i+1, prev);
        if(prev == -1 || arr[i] > arr[prev]) {
            length = Math.max(length, 1 + subs(arr, i+1, i));
        }
        dp[i][prev+1] = length;
        return length;
    }
}