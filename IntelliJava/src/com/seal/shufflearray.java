package com.seal;

class shufflearray {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            if(i%2==0) {
                arr[i] = nums[i/2];
            }
            else {
                arr[i] = nums[n/2 + i/2];
            }
        }
        return arr;
    }
}