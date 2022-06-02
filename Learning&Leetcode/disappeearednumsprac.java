import java.util.*;
public class disappeearednumsprac {
    public static List<Integer> findDisappearedNumbers(int[] nums){
        List<Integer> ans = new ArrayList<>();
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i+1 != nums[i]){
                ans.add(i+1);
            }
        }
        return ans;
    }   
    public static void sort(int arr[]){
        int i = 0;
        while(i<arr.length){
            if(arr[i] != arr[arr[i] - 1]){
                swap(arr, i, arr[i]-1);
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
}
