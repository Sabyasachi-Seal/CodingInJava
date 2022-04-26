import java.util.*;
public class arrayintersection2 {
    public static int[] intersect(int[] nums1, int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans = new ArrayList<Integer>();
        //remove duplicates
        for(int i=0; i<nums1.length; i++){
            if(binarysearch(nums2, 0, nums2.length-1, nums1[i])>-1){
                ans.add(nums2[i]);
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
