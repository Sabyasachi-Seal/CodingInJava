import java.util.Arrays;

// https://leetcode.com/problems/largest-perimeter-triangle/
public class largesttriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i>=2; i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}
