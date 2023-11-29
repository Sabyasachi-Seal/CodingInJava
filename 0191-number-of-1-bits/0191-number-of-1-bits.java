public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        // System.out.println(n);
        
        int ans = 0;
        
        while(n!=0){
            
            // System.out.println(n);
            
            if((n&1) == 1) ans++;
            
            n >>>= 1;
            
        }
        
        return ans;
    }
}