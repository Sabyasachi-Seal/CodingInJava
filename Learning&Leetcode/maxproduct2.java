import java.util.Arrays;

public class maxproduct2 {
    // public int maxProduct(int[] nums) {
    //     Arrays.sort(nums);
    //     return nums[nums.length-1]*nums[nums.length-2];   
    // }
    public int maxProduct(int[] nums){
        int max1 = nums[0];
        int max2 = nums[1];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>max1){
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i]>max2){
                max2 = nums[i];
            }
        }
        return (max1-1)*(max2-1);
    }
}
