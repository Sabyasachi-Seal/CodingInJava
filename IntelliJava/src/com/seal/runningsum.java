package com.seal;

class runningsum {
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            arr[i] = nums[i] + arr[i-1];
        }
        return arr;
    }
}