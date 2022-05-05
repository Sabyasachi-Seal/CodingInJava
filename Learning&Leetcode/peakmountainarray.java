// https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class peakmountainarray {
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0, end = arr.length-1, mid =0;
        while(start<end){
            mid = start + (end - start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid + 1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        // int[] arr = {24,69,99,100,79,78,67,36,26,19};
        int[] arr = {5,6,7,0,1,2,4};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
