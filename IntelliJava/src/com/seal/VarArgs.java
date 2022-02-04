package com.seal;
import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args){
        show(1,2,3,4,5);
        show(1,2,3,4,5,6,7,8,9,10);
    }
    static void show(int ...nums){
        System.out.println(Arrays.toString(nums));
    }
}
