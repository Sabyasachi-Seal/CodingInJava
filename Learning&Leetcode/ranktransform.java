// https://leetcode.com/problems/rank-transform-of-an-array/
import java.lang.reflect.Array;
import java.util.*;
class ranktransform {
    // public static int[] arrayRankTransform(int[] arr) {
    //     int[] temp = arr.clone();
    //     int[] rank = new int[arr.length];
    //     if(arr.length==0) return arr;
    //     Arrays.sort(temp);
    //     rank[0] = 1;
    //     for (int i = 1; i < rank.length; i++) {
    //         if(temp[i]==temp[i-1]){
    //             rank[i] = rank[i-1];
    //         }
    //         else{
    //             rank[i] = rank[i-1] + 1;
    //         }
    //     }
    //     for (int i = 0; i < rank.length; i++) {
    //         arr[i] = Arrays.binarySearch(temp, arr[i]);
    //         arr[i] = rank[arr[i]];
    //     }
    //     return arr;
    // }
    public static int[] arrayRankTransform(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] copy = arr.clone();
        Arrays.sort(copy);
        int rank = 1;
        for (int i = 0; i < arr.length;i++) {
            if(!hm.containsKey(copy[i])) hm.put(copy[i], rank++);
        }
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[i] = hm.get(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {37,12,28,9,100,56,80,5,12};
        arr = arrayRankTransform(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}