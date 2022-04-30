public class maxsubarray {
    public static int maxSubArray(int[] nums){
        int max= -Integer.MAX_VALUE, sum;
        for(int i=0; i<nums.length; i++){
            sum = nums[i];
            max = max(max, sum);
            for(int j=i+1; j<nums.length; j++){
                sum += nums[j];
                max = max(max, sum);
            }
        }
        return max;
    }
    public static int max(int a, int b){
        return (a>b)?a:b;
    }
    public static void main(String[] args) {
        int[] arr = {-2, 1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }
}
