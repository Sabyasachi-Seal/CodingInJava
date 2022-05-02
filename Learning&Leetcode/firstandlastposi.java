// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class firstandlastposi {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        int posi = binarysearch(nums, 0, nums.length-1, target);
        while(posi>0 && nums[posi] == nums[posi-1])    {
            posi = binarysearch(nums, 0, posi, target);
        }
        ans[0] = posi;
        posi = binarysearch(nums, 0, nums.length-1, target);
        while(posi>-1 && posi<nums.length-1 && nums[posi] == nums[posi+1])    {
            posi = binarysearch(nums, posi+1, nums.length-1, target);
        }
        ans[1] = posi;
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
