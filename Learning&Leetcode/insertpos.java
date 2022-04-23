// https://leetcode.com/problems/search-insert-position/
public class insertpos {
    public static int searchInsert(int[] nums, int target) {
        int start =0, end = nums.length-1, mid=0;
        while(start<=end){
            mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,6}, target = 1;
        System.out.println(searchInsert(arr, target));
    }
}
