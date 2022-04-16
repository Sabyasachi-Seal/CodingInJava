// https://leetcode.com/problems/add-to-array-form-of-integer/
import java.util.*;
import java.lang.Math;
class arrayform {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        long number = 0;
        for(int dig : num){
            // System.out.println(number);
            number = number*10 + dig;
        }

        number += k;
        // System.out.println(number);
        k = (int)Math.log10(number);
        String[] nums = new String[(int)Math.log10(number)+1];
        List<Integer> numbers = new ArrayList<Integer>();

        while(number>0){
            nums[k] = Long.toString(number%10);
            number /= 10;
            k--;
        }
        
        for(String i: nums){
            numbers.add(Integer.parseInt(i));
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k = 516;
        System.out.println(addToArrayForm(nums, k));
    }
}