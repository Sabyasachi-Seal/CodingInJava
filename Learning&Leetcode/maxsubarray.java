public class maxsubarray {
    public static int maxSubArray(int[] nums){
        int max = nums[0], sum = 0;
        for(int num: nums){
            sum += num;
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
    public static int max(int a, int b){
        return (a>b)?a:b;
    }
    public static void main(String[] args) {
        int[] arr = {-2};
        System.out.println(maxSubArray(arr));
    }
}
