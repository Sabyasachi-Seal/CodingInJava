class Solution {
    public int search(int[] nums, int target) {
        // find breakpoint
        // then search
        int start = 0;
        int end = nums.length-1;

        int brk = -1;

        while(start < end){
            int mid = start + (end-start)/2;

            if(mid<nums.length-1 && nums[mid] > nums[mid+1]){
                brk = mid;
                break;
            }
            else if(mid>0 && nums[mid] < nums[mid-1]){
                brk = mid-1;
                break;
            }
            else if(nums[start] < nums [mid]){
                start = mid+1;
            }
            
            else {
                end = mid;
            }

        }

        System.out.println(brk);
        
        if(brk == -1) return bs(false, nums, 0, nums.length-1, target);
        
        else if(target >= nums[0]){
            return bs(false, nums, 0, brk, target );
        }
        else{
            return bs(false, nums, brk+1, nums.length-1, target );
        }
    }
    
    private int bs(boolean isReverse, int arr[], int start, int end, int target){
              
        while(start <= end){
            
            int mid = start + (end-start)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                end = mid-1;
                
            }
            else{

                start = mid+1;
            }
            
            
        }
        
        return -1;
        
    }
    
}