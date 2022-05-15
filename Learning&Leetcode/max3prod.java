// https://leetcode.com/problems/maximum-product-of-three-numbers/
import java.util.*;
public class max3prod {
    // public int maximumProduct(int[] nums){
    //     Arrays.sort(nums);
    //     return max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3], nums[nums.length-1]*nums[0]*nums[1]);
    // }
    // public static int max(int a, int b) {
    //     return (a>b)?a:b;
    // }
    public int maximumProduct(int[] nums){
        int m1 = Integer.MIN_VALUE, m2=m1, m3=m2;
        int min1= Integer.MAX_VALUE, min2 = min1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > m1){
                m3 = m2;
                m2 = m1;
                m1 = nums[i];
            }
            else if(nums[i]>m2){
                m3= m2;
                m2 = nums[i];
            }
            else if(nums[i]>m3){
                m3 = nums[i];
            }
            if(nums[i]<min1){
                min2 = min1;
                min1 = nums[i];
            }
            else if(nums[i] < min2){
                min2 = nums[i];
            }
        }
        return max(m1*m2*m3, min1*min2*m1);
    }
    public static int max(int a, int b) {
        return (a>b)?a:b;
    }
}
