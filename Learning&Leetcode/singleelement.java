// https://leetcode.com/problems/single-element-in-a-sorted-array/
public class singleelement {
    public static int singleNonDuplicate(int[] arr) {
        int mid;
        int start = 0, end = arr.length-1;
        while(start<end){
            mid = start + (end - start)/2;
            if((mid & 1) == 1){
                mid--;
            }
            if(arr[mid]==arr[mid+1]){
                start = mid + 2;
            }
            else{
                end = mid;
            }
        }
        return arr[start];
    }
    // public int singleNonDuplicate(int[] nums){
    //     int i = 0;
    //     for (i = 0; i<nums.length-1 && nums[i] == nums[i+1]; i++) {
    //         i++;
    //     }
    //     return nums[i];
    // }
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(arr));
    }
}
