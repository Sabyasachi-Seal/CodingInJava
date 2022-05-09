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
    public static void main(String[] args) {
        int[] arr = {2, 0 , 2, 1, 1, 0};
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
