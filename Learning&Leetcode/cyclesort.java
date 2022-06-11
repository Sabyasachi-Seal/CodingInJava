public class cyclesort {
    public static int[] cycle(int nums[]){
    //     for (int i = 0; i < arr.length; i++) {
    //         while(!(arr[arr[i]-1] == arr[i]) && arr[i]!=i+1){
    //             swap(arr, i, arr[i]-1);
    //         }
    //     }
    //     return arr;
    // }
        int i= 0;
        while(i<nums.length){
            if(nums[i]-1!=i){
                int corind = nums[i]-1;//correct index
                if(nums[i]==nums[corind]) return new int[]{nums[i]};//duplicate
                swap(nums, i, corind);
            }
            else{
                i++;
            }
        }
        return nums;
    }
    public static void swap(int arr[], int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
    public static void main(String[] args) {
        int a[] = {3, 1, 4, 2, 4};
        int ans[] = cycle(a);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]+" ");
        }
    }
}
