class Solution {
    
    private int mod = 1000000007;
    
    private int dp[][][];
    
    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        // max elements that can be taken is n
        // min profit should be considered
        // do a take or not take for every index
        // do it for max n time
        // since it is index based, it is unique
        // end when index is reached or n is zero
        // backtack with the n
        
        dp = new int[101][101][101];
        
        for(int[][] block: dp){
            for(int[] row: block){
                Arrays.fill(row, -1);
            }
        }
        
        return profit(0, 0, 0, minProfit, n, group, profit);
        
    }
    private int profit(int ind, int curr, int taken, int min, int n, int g[], int p[]){
        
        if(ind == g.length){
            
            if(curr >= min) return 1;
            
            return 0;
        }
        
        
        if(dp[ind][curr][taken]!=-1) return dp[ind][curr][taken];
        
        
        int ans = profit(ind+1, curr, taken, min, n, g, p);
        
        if(taken + g[ind] <= n){
            
            ans += profit(ind+1, Math.min(min, curr+p[ind]), taken+g[ind], min, n, g, p);
            
        }

        dp[ind][curr][taken] = ans%mod;
        
        return dp[ind][curr][taken];
        
    }
    
}