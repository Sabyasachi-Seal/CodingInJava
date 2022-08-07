import java.util.Arrays;

class combinationsumiv{
    public int[] dp;
    public int combinationSum4(int[] arr, int target) {
        dp = new int[target+1];
        Arrays.fill(dp, -1);
        return combi(arr, target);
    }
    public int combi(int arr[], int target){
        if(dp[target] != -1) return dp[target];
        if(target == 0){
            return 1;
        }
        int res = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > target) continue;
            res += combi(arr, target-arr[i]);
        }
        dp[target] = res;
        return res;
    }
    public static void main(String[] args){
        combinationsumiv c = new combinationsumiv();
        int[] arr = {1,2,3};
        int target = 4;
        System.out.println(c.combinationSum4(arr, target));
    }
}