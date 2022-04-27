import java.util.*;
public class arrayintersection2 {
    public static int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for(int i=0, j=0; i<nums1.length && j<nums2.length;){
            if(nums1[i] == nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int smaller = min(nums1.length, nums2.length);
        int[] arr = new int[min(smaller, ans.size())];
        for (int i = 0; i < arr.length; i++)
            arr[i] = ans.get(i);
        return arr;
    }
    public static int min(int a, int b){
        return (a<b)?a:b;
    }
    // public static int binarysearch(int[]arr, int start, int end, int target){
    //     int mid=0;
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
}
