// https://leetcode.com/problems/rank-transform-of-an-array/
import java.util.*;
class ranktransform {
    public static int[] arrayRankTransform(int[] arr) {
        ArrayList<Integer> copy = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!copy.contains(arr[i])) copy.add(arr[i]);
        }
        Collections.sort(copy);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = search(copy, 0, copy.size()-1, arr[i]) + 1;
        }
        return arr;
    }
    public static int search(ArrayList<Integer> arr, int start, int end, int target){
        int mid;
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr.get(mid) == target){
                return mid;
                // if(mid>0 && arr.get(mid-1)!=arr.get(mid)){
                //     return mid;
                // }
                // else if(mid<arr.size()-1 && arr.get(mid+1)!=arr.get(mid)){
                //     return mid;
                // }
                // else{
                    
                // }
            }
            else if(arr.get(mid)<target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        arr = arrayRankTransform(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}