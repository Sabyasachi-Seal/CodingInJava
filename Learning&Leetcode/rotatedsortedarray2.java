public class rotatedsortedarray2 {
    public static boolean search(int[] nums, int target) {
        int pivot = pivotfinder(nums);
        if(nums.length<2 && nums[0]==target){
            return true;
        }
        if(pivot==-1){
            return false;
        }
        else if(nums[pivot]==target){
            return true;
        }
        else if(target>=nums[0]){
            pivot = binarysearch(nums, 0, pivot-1, target);
            if(pivot!=-1){
                return true;
            }
        }
        else{
            pivot = binarysearch(nums, pivot+1, nums.length-1, target);
            if(pivot!=-1){
                return true;
            }
        }
        return false;
    }
    public static int binarysearch(int[] arr, int start, int end, int target){
        int mid;
        while(start<=end){
            mid  = start + (end - start)/2;
            if(arr[mid]==target){
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
    public static int pivotfinder(int[] arr) {
        int start=0, end = arr.length-1, mid =0;
        while(start<=end){
            mid = start + (end - start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid>start &&arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] == arr[start] && arr[mid]==arr[end]){
                if(start<end && arr[start] > arr[start+1]){
                    return start;
                }
                start++;
                if(end>start && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start] == arr[mid] && arr[mid]>arr[end])){
                start = mid +1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
