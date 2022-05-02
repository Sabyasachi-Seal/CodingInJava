// https://leetcode.com/problems/find-peak-element/
public class findpeakelement {
    public int findPeakElement(int[] nums) {
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
}
