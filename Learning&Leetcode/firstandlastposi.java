// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class firstandlastposi {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = binarysearch(nums, 0, nums.length-1, target);
        while(ans[0]>0 && nums[ans[0]] == nums[ans[0]-1])    {
            ans[0] = binarysearch(nums, 0, ans[0], target);
        }
        ans[1] = binarysearch(nums, 0, nums.length-1, target);
        while(ans[1]>-1 && ans[1]<nums.length-1 && nums[ans[1]] == nums[ans[1]+1])    {
            ans[1] = binarysearch(nums, ans[1]+1, nums.length-1, target);
        }
        return ans;
    }
    public static int binarysearch(int[]arr, int start, int end, int target){
        int mid;
        while(start<=end){
            mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2};
        int target = 2;
        int []ans = searchRange(arr, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
