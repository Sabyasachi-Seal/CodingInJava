import java.util.Arrays;
// https://leetcode.com/problems/check-if-n-and-its-double-exist/
public class checkdouble {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]<0){
                if(binarysearch(arr, 0, i-1, 2*arr[i])>-1){
                    return true;
                }
            }
            else{
                if(binarysearch(arr, i+1, arr.length-1, 2*arr[i])>-1){
                    return true;
                }
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
}
