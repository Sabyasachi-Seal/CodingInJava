import java.util.Arrays;
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
public class specialarray {
    public static int specialArray(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        // int ind = 0;
        for (int i = 1; i <= nums[nums.length-1]; i++) {
            count = 0;
            for (int j = 0; j < nums.length;) {
                if(i <= nums[j]){
                    count++;
                }
                j++;
            }
            if(count == i){
                return count;
            }
            // ind = binarysearch(nums, i+1, nums.length-1, i);
            // int temp = ind;
            // while(ind<nums.length && nums[ind] >= i){
            //     ind++;
            //     count++;
            // }
            // if(count == temp){
            //     return count;
            // }
            // else{
            //     count = 0;
            // }
        }
        return -1;
    }
    // public static int binarysearch(int[] arr, int start, int end, int target){
    //     int mid;
    //     while(start<=end){
    //         mid  = start + (end - start)/2;
    //         if(arr[mid]==target){
    //             return mid;
    //         }
    //         else if(arr[mid]<target){
    //             start = mid+1;
    //         }
    //         else{
    //             end = mid -1;
    //         }
    //     }
    //     return end;
    // }
    public static void main(String[] args) {
        int arr[] = {3, 5};
        System.out.println(specialArray(arr));
    }
}
