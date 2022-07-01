public class setmismatchprac {
    public static int[] findErrorNums(int[] nums){
        // use cycle sort
        int i = 0;
        int ans[] = new int[2];
        while(i<nums.length){
            if(nums[i] != i+1){
                if(nums[nums[i]-1] == nums[i]){
                    ans[0] = nums[i];
                    break;
                }
                else swap(nums, i, nums[i]-1);
            }
            else i++;
        }
        ans[1] ^= ans[0];
        for(i=1; i<=nums.length; i++){
            ans[1] ^= nums[i-1];
            ans[1] ^= i;
        }
        return ans;
    }
    public static void swap(int[] arr, int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
    public static void main(String[] args) {
        int []arr = {4, 1, 2, 2, 5};
        findErrorNums(arr);
        for(int i: arr) System.out.print(i+" ");
    }
}
