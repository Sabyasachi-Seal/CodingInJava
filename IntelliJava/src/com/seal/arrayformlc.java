package com.seal;

// https://leetcode.com/problems/add-to-array-form-of-integer/
import java
import java.lang.Math;
class arrayformlc {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int number = 0;
        for(int dig : num){
            number = number*10 + dig;
        }
        number+=k;
        k = 0;
        while(number>0){
            num[k] = number/(int)(Math.pow(10, num.length-k-1));
            System.out.println(num[k]);
            number %= (int)(Math.pow(10, num.length-k-1));
            k++;
        }
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i:num){
            numbers.add(i);
        }
        return numbers;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,5};
        int k = 806;
        System.out.println(addToArrayForm(nums, k));
    }
}