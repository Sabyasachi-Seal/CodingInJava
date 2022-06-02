public class specialcyclicsort {
    public static int sort(int nums[]){
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] -1;
            if(nums[i]>0 && nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }
        for (i = 1; i <= nums.length; i++) {
            if(nums[i-1] != i){
                return i;
            }
        }
        return nums.length+1;
    }
    public static void swap(int arr[], int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
