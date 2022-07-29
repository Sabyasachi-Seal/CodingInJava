package com.seal;

class contatenationarray {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length * 2;
        int i;
        int arr[] = new int[n];
        for (i=0; i<n; i++){
            arr[i] = nums[i%nums.length];
        }
        return arr;
    }
}
