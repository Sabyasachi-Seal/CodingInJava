// https://leetcode.com/problems/find-the-duplicate-number/
public class duplicatenumprac {
    public int findDuplicate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            while(!(arr[arr[i]-1] == arr[i]) && arr[i]!=i+1){
                swap(arr, i, arr[i]-1);
            }
        }
        return arr[arr.length-1];
    }
    public static void swap(int arr[], int a, int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }
}
