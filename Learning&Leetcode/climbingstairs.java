public class climbingstairs {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        return Math.min(mincost(cost, 0, 0, dp), mincost(cost, 1, 0, dp));
    }
    public static int mincost(int cost[], int i, int total, int[] dp){
        if(i >= cost.length){
            return total;
        }
        if(dp[i] != 0) return dp[i];
        dp[i] = cost[i] + Math.min(mincost(cost, i+1, total, dp), mincost(cost, i+2, total, dp));
        return dp[i];
    }
}
