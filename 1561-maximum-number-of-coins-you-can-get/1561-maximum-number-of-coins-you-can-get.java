class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        for(int i: piles) dq.addFirst(i);
        
        int ans = 0;
        
        while(!dq.isEmpty()){
            dq.removeFirst();
            ans += dq.removeFirst();
            dq.removeLast();
        }
        
        return ans;
        
    }
}