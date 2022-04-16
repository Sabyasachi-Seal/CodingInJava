// https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.*;
import java.lang.Math;
class arrayform {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        long number = 0;
        for(int dig : num){
            System.out.println(number);
            number = number*10 + dig;
        }
        number += k;
        System.out.println(number);
        k = (int)Math.log10(number);
        long nums[] = new long[num.length];
        List<Integer> numbers = new ArrayList<Integer>();
        while(k<(int)Math.log10(number)){
            nums[k] = number%10;
            System.out.println(num[k]);
            number /= 10;
            k--;
        }
        for(long i: nums){
            numbers.add((int)i);
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] nums = {9,9,9,9,9,9,9,9,9,9};
        int k = 1;
        System.out.println(addToArrayForm(nums, k));
    }
}