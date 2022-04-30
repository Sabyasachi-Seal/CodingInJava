import javax.management.openmbean.CompositeType;

public class removeduplicates {
    // public static int removeDuplicates(int[] nums) {
    //     int count = 0;
    //     for(int i=0; i<nums.length-1; i++){
    //         int j = i+1;
    //         while(j<nums.length && nums[j]==nums[i]){
    //             count++;
    //             j++;
    //         }
    //         if(nums[j]!=nums[i]){
    //             i++;
    //             nums[i]  = nums[j];
    //         }

    //     }
    //     return nums.length - count;
    // }
    // public static void swap(int a, int b){

    // }
    public static int removeDuplicates(int[] nums){
        int i = 0;
        int j = 1;
        while(j < nums.length){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
                System.out.println(nums[i]);
            }
            j++;
        }
        return i+1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 3, 4, 4};
        System.out.println(removeDuplicates(arr));
    }
}
