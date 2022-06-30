import java.util.*;
public class minmove {
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int m = (nums.length & 1)==1?nums[nums.length/2]: (nums[nums.length/2]+nums[nums.length/2 - 1])/2;
        int ans = 0;
        for(int i = 0; i<nums.length; i++){
            ans += Math.abs(nums[i]-m);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(minMoves2(new int[]{1, 2, 3}));
    }
}
