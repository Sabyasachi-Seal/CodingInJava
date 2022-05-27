// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
import java.util.*;
public class specialarrayx {
    public static int specialArray(int[] nums){
        Arrays.sort(nums);
        for (int i=1,p=0; i<=nums[nums.length-1];) {
            if(p<nums.length && nums[p]>=i){
                if(i==nums.length-p){
                    return i;
                }
                else{
                    i++;
                }
            }
            else{
                p++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {0,4,3,0,4};
        System.out.println(specialArray(arr));
    }
}
