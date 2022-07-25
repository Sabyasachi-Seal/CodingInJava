public class sortedfirstandlastposi {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{binary(nums, target, true), binary(nums, target, false)};
    }
    private int binary(int[] nums, int target, boolean lbias){
        int start = 0;
        int end = nums.length-1;
        int index = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                index = mid;
                if(lbias){
                    start = mid +1;
                }
                else{
                    end = mid -1;
                }
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else if(nums[mid] > target){
                end = mid-1;
            }
        }
        return index;
    }
}
