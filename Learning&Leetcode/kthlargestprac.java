import java.util.*;
public class kthlargestprac {
    public static int findKthLargest(int[] nums, int k) {
        int max[] = new int[k];
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>=maxi){
                for (int j = max.length-1; j >= 1; j--) {
                    max[j] = max[j-1];
                }
                max[0] = nums[i];
                maxi = max[0];
            }
        }
        return nums[k-1];
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1 ,5 ,6 ,2 , 6, 8};
        System.out.println(findKthLargest(arr, 3));
    }
}
