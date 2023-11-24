class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        
        int ans = 0;
        
        int skip = piles.length/3;
        
        for(int i=0; i<piles.length; i++){
            
            if(i<skip) continue;
            
            ans += piles[i];
            i++;
            
        }
        
        return ans;
        
    }
}