// https://leetcode.com/problems/sort-colors/
public class sortcolours {
    public static void sortColors(int[] nums) {
        int zeros=0, ones=0, twos=0;
        for(int num: nums){
            if(num==0) zeros++;
            else if(num==1) ones++;
            else twos++;
        }
        for (int i = 0; i < nums.length; i++) {
            if(i<zeros){
                nums[i] = 0; 
                continue;
            }
            if(i<(zeros+ones)){
                nums[i] = 1;
                continue;
            }
            if(i<(zeros+ones+twos)){
                nums[i] = 2;
                continue;
            }

        }
    }
    // public static void swap(int[] arr, int a, int b){
    //     arr[a] = arr[a] + arr[b];
    //     arr[b] = arr[a] - arr[b];
    //     arr[a] = arr[a] - arr[b];
    // }
    // public static void sortColors(int[] nums) {
    //     int l=0, m=0, h=nums.length-1;
    //     while(m<=h && nums.length>1){
    //         if(nums[m] == 0){
    //             swap(nums, l, m);
    //             l++;
    //             m++;
    //         }
    //         else if(nums[m] == 1){
    //             m++;
    //         }
    //         else{
    //             swap(nums, m, h);
    //             h--;
    //         }
    //     }
    // }
    public static void main(String[] args) {
        int[] arr = {2};
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
