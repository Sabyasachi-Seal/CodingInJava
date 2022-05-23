import java.util.Arrays;

// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
public class sortbybits {
    public static int[] sortByBits(int[] arr) {
        int[] bits = new int[arr.length];
        int[] ans = new int[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < bits.length; i++) {
            bits[i] = bitcount(arr[i]);
        }
        int l = 0;
        for (int i = 0; i <= 14; i++) {
            for (int j = 0; j < bits.length; j++) {
                if(i==bits[j]){
                    ans[l] = arr[j];
                    l++;
                    
                }
            }
        }
        return ans;
    }
    public static int bitcount(int a){
        int count = 0;
        while(a>0){
            if((a & 1)==1){
                count++;
            }
            a >>= 1;
        }
        return count;
    }
    // public static int[] sortByBits(int[] arr) {
    //     int[] bits = new int[arr.length];
    //     int[] ans = new int[arr.length];
    //     Arrays.sort(arr);
    //     for(int i = 0; i < arr.length; i++){
    //         int count = 0;
    //         int n = arr[i];
    //         while(n > 0){
    //             if((n & 1) == 1){
    //                 count++;
    //             }
    //             n >>= 1;
    //         }
    //         bits[i] = count;
    //     }
    //     int l = 0;
    //     for(int j = 0; j <= 14; j++){
    //         int length = 0;
    //         for(int k = 0; k < bits.length; k++){
    //             if(j == bits[k]){
    //                 length++;
    //                 ans[l] = arr[k];
    //                 l++;
    //             }
    //         }
    //     }
    //     return ans;
    // }
    public static void main(String[] args) {
        int[] arr = {5, 2, 1 , 6, 3};
        int ans[] = sortByBits(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
