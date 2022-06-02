// https://leetcode.com/problems/missing-number/
public class missingnumcyclic {
    public static int missingNumber(int[] nums){
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i!=nums[i]){
                return i; 
            }
        }
        return nums.length;
    }
    public static void sort(int arr[]){
        // cyclic sort
        int i = 0;
        while(i<arr.length){
            if(arr[i]==arr.length){
                i++;
            }
            else if(arr[i] != i){
                swap(arr, i, arr[i]);
            }
            else{
                i++;
            }
        }
    }
    public static void swap(int arr[], int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 1, 0, 4, 3};
        sort(arr);
        System.out.println(missingNumber(arr));
    }
}
