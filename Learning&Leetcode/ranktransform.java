// https://leetcode.com/problems/rank-transform-of-an-array/
import java.util.*;
class ranktransform {
    // public static int[] arrayRankTransform(int[] arr) {
    //     int[] copy = new int[arr.length];
    //     for (int i = 0; i < copy.length; i++) {
    //         copy[i] = arr[i];
    //     }
    //     Arrays.sort(copy);
    //     // int ci = -1;
    //     // int cc = 0;
    //     // for (int i = 0; i < copy.length-1; i++) {
    //     //     if(copy[i]==copy[i+1]){
    //     //         if(ci==-1) ci = i+1;
    //     //         cc++;
    //     //     }
    //     // }
    //     for (int i = 0; i < arr.length; i++) {
    //         int ind = search(copy, 0, arr.length-1, arr[i]);
    //         // if(ind>=ci){
    //         //     arr[i] = ind + 1 - cc;
    //         // }
    //         // else{
    //         //     arr[i] = ind + 1;
    //         // }
    //         arr[i] = ind + 1; 
    //     }
    //     return arr;
    // }
    // public static int search(int[] arr, int start, int end, int target){
    //     int mid;
    //     while(start<=end){
    //         mid = start + (end-start)/2;
    //         if(arr[mid] == target){
    //             while(mid>0 && arr[mid]==arr[mid-1]){
    //                 mid--;
    //             }
    //             return mid;
    //         }
    //         else if(arr[mid]<target){
    //             start = mid + 1;
    //         }
    //         else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }
    public static int[] arrayRankTransform(int[] arr) {
        int[] temp = arr.clone();
        int[] rank = new int[arr.length];
        if(arr.length==0) return arr;
        Arrays.sort(temp);
        rank[0] = 1;
        for (int i = 1; i < rank.length; i++) {
            if(temp[i]==temp[i-1]){
                rank[i] = rank[i-1];
            }
            else{
                rank[i] = rank[i-1] + 1;
            }
        }
        for (int i = 0; i < rank.length; i++) {
            arr[i] = Arrays.binarySearch(temp, arr[i]);
            arr[i] = rank[arr[i]];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        arr = arrayRankTransform(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}