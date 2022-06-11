class reducextozero {
    public static int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int n:nums) sum+=n;
        int max = -1, currsum =0;
        int l = 0, r = 0;
        while(r<nums.length){
            currsum += nums[r];
            while(l<=r && currsum>sum-x){
                currsum -= nums[l];
                l++;
            }
            if(currsum==sum-x) max = Math.max(max, r-l+1);
            r++;
        }
        return max==-1?-1:nums.length-max;
    }
    public static void main(String[] args) {
        // int a[] = {3, 2, 20, 1 ,1, 3};
        int a[] = {6016,5483,541,4325,8149,3515,7865,2209,9623,9763,4052,6540,2123,2074,765,7520,4941,5290,5868,6150,6006,6077,2856,7826,9119};
        int target = 31841;
        System.out.println(minOperations(a, target));
    }
}