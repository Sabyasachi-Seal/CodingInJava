import java.util.*;
// https://leetcode.com/problems/majority-element/
class majorityelement {
    public static int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int count = 0, i=0;
        // for(i=0; i<nums.length-1; i++){
        //     if(nums[i] == nums[i+1]){
        //         count++;
        //     }
        //     else{
        //         count++;
        //         if(count > nums.length/2){
        //             break;
        //         }
        //         else{
        //             count = 0;
        //         }
        //     }
        // }
        // return nums[i];
        // Arrays.sort(nums);
	    // return nums[nums.length/2];
        int ele = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(count == 0){
                ele = nums[i];
            }
            if(nums[i] ==  ele){
                count++;
            }
            else{
                count--;
            }
        }
        return ele;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(majorityElement(arr));
    }
}