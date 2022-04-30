//https://leetcode.com/problems/plus-one/
import java.util.*;
public class plusone {
    // public static int[] plusOne(int[] digits) {
    //     digits[digits.length-1]++;
    //     if(digits[digits.length-1]>9){
    //         for(int i=digits.length-2; i>=0 && digits[i+1]+1>9; i--){
    //             digits[i]++;
    //             digits[i+1] = 0; 
    //         }
    //         if(digits[0]>9){
    //             int[] ans = new int[digits.length+1];
    //             int i;
    //             for (i=ans.length-2; i>0; i--) {
    //                 ans[i] = digits[i];
    //             }
    //             ans[i] = 1;
    //             ans[i+1] = 0;
    //             return ans;
    //         }
    //     }
    //     return digits;
    // }
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1]++;
        if(digits[digits.length-1]>9){
            for(int i=digits.length-2; i>=0; i--){
                digits[i]++;
                digits[i+1] = 0;
                if(digits[i]>9){
                    continue;
                }
                else{
                    break;
                }
            }
            if(digits[0]>9){
                int[] ans = new int[digits.length+1];
                int i;
                for (i=ans.length-2; i>0; i--) {
                    ans[i] = digits[i];
                }
                ans[i] = 1;
                ans[i+1] = 0;
                return ans;
            }
        }
        return digits;
    }
    public static void main(String[] args) {
        int[]arr = {9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        int[]ans = plusOne(arr);
        for (int i = 0; i < ans.length; i++) {
             System.out.println(ans[i]);
        }
    }
}
