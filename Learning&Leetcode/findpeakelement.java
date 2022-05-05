// https://leetcode.com/problems/find-peak-element/
public class findpeakelement {
    public static int findPeakElement(int[] nums) {
        int start = 0, mid, end = nums.length-1;
        while(start<end){
            mid = start + (end - start)/2;
            if(nums[mid]<nums[mid+1]){
                start = mid + 1;
            }
            else{
                end = mid;
            }
        } 
        return start;  
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,0,1,2,4};
        System.out.println(findPeakElement(arr));
    }
}
