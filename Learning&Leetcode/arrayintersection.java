import java.util.*;
public class arrayintersection {
    // public static int[] intersection(int[] nums1, int[] nums2) {
    //     ArrayList<Integer> ans = new ArrayList<Integer>();
    //     int smallerarr[] = (nums1.length<nums2.length)?nums1.clone():nums2.clone();
    //     int largerarr[] = (nums1.length>nums2.length)?nums1.clone():nums2.clone();
    //     quicksort(largerarr, 0, largerarr.length-1);
    //     for(int i=0; i<smallerarr.length; i++){
    //         if(binarysearch(largerarr, smallerarr[i])!=-1){
    //             if(!ans.contains(smallerarr[i])){
    //                 ans.add(smallerarr[i]);
    //             }
    //         }
    //     }
    //     int[] arr = new int[ans.size()];
    //     for (int i = 0; i < ans.size(); i++)
    //         arr[i] = ans.get(i);
    //     return arr;
    // }
    // public static int min(int a, int b){
    //     return (a<b)?a:b;
    // }
    // public static void swap(int[] arr, int i, int j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    // }
    // public static int partition(int[] arr, int low, int high){
    //     int pivot = arr[high];
    //     int i = low -1;
    //     for (int j = low; j <= high-1; j++) {
    //         if(arr[j]<pivot){
    //             i++;
    //             swap(arr, i, j);
    //         }
    //     }
    //     swap(arr, i+1, high);
    //     return (i+1);
    // }
    // public static void quicksort(int[] arr, int low, int high){
    //     if(low<high){
    //         int pi = partition(arr, low, high);
    //         quicksort(arr, low, pi-1);
    //         quicksort(arr, pi+1, high);
    //     }
    // }
    // public static int binarysearch(int[]arr, int target){
    //     int start = 0, end = arr.length-1, mid=0;
    //     while(start<=end){
    //         mid = start + (end - start)/2;
    //         if(arr[mid]==target){
    //             return mid;
    //         }
    //         else if(arr[mid]<target){
    //             start = mid+1;
    //         }
    //         else{
    //             end = mid-1;
    //         }
    //     }
    //     return -1;
    // }
    public static int[] intersection(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int smallerarr[] = (nums1.length<nums2.length)?nums1.clone():nums2.clone();
        int largerarr[] = (nums1.length>nums2.length)?nums1.clone():nums2.clone();
        //remove duplicates
        for(int i=0; i<smallerarr.length; i++){
            if(binarysearch(smallerarr, i+1, smallerarr.length-1, smallerarr[i])!=-1 && binarysearch(largerarr, 0, largerarr.length-1, smallerarr[i])>-1){
                ans.add(smallerarr[i]);
            }
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++)
            arr[i] = ans.get(i);
        return arr;

    }
    public static int binarysearch(int[]arr, int start, int end, int target){
        int mid=0;
        while(start<=end){
            mid = start + (end - start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
