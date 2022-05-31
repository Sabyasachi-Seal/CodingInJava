// https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/
import java.util.*;
public class binarycodes {
    // public static boolean hasAllCodes(String s, int k) {
    //     String temp;
    //     for (int i = 0; i < 1<<k/*1<<k is equivalent to Math.Pow(2, k*/; i++) {
    //         temp  = getbinary(i, k);
    //         if(!issubstring(s, temp)){
    //             return false;
    //         }
    //     }
    //     return true;
    // }
    // public static String getbinary(int num, int n){
    //     int [] temp = new int[n];
    //     int index = 0;
    //     while(num>0){
    //         temp[index++] = num%2;
    //         num /= 2;
    //     }
    //     String temp2 = "";
    //     for (int i = 0; i < n; i++) {
    //         temp2 += Integer.toString(temp[i]);
    //     }
    //     return temp2;
    // }
    // public static boolean issubstring(String s, String temp){
    //     if(s.indexOf(temp)>=0){
    //         return true;
    //     }
    //     else {
    //         return false;
    //     }
    // }
    public static boolean hasAllCodes(String s, int k){
        Set<String> seen = new HashSet<>();
        for (int i = k; i <= s.length() && seen.size() < 1<<k; i++) {
            seen.add(s.substring(i-k, i));
        }
        return seen.size()==1<<k;
    }
    public static void main(String[] args) {
        String s = "01010";
        System.out.println(hasAllCodes(s, 3));
    }
}
