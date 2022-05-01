// https://leetcode.com/problems/fair-candy-swap/
import java.util.*;
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int[] ans = new int[2];
        Arrays.sort(bobSizes);
        int ta=0, tb=0;
        for (int a: aliceSizes){
            ta += a;
        }  
        for (int b : bobSizes) {
            tb += b;
        }
        
        int d = (tb - ta)/2;

        for(int i: aliceSizes){
            if(binarysearch(bobSizes, i+d)>-1){
                ans[0] = i;
                ans[1] = i+d;
                return ans;
            }
        }
        return null;
    }
    public static int binarysearch(int[] arr, int target){
        int start = 0, end = arr.length-1, mid;
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
