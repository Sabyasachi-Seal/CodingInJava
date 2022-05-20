// https://leetcode.com/problems/relative-sort-array/
import java.util.*;
public class relativesort {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ans = new int[arr1.length];
        int i = 0;
        for(int num: arr2){
            for (int j = 0; j < arr1.length; j++) {
                if(arr1[j]==num){
                    arr1[j] = -1;
                    ans[i++] = num;
                }
            }
        }
        Arrays.sort(arr1);
        i = ans.length-1;
        for (int j = ans.length-1; j >=0 ; j--) {
            if(arr1[j]==-1) break;
            ans[i--] = arr1[j];  
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int[] ans = relativeSortArray(arr1, arr2);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" " );
        }

    }
}
