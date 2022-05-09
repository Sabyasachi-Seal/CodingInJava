// https://leetcode.com/problems/sort-colors/
public class sortcolours {
    public void sortColors(int[] nums) {
        boolean swapped = true;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 0; j < nums.length-i-1; j++) {
                if(nums[j] > nums[j+1]){
                    swapped = true;
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
}
}
