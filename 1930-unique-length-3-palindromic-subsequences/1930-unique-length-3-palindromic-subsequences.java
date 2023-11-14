class Solution {
    public int countPalindromicSubsequence(String s) {
        
        HashSet<Character> hs = new HashSet<>();
        
        HashSet<Character> newHs = new HashSet<>();
        
        int ans = 0;
        
        for(char c: s.toCharArray()){
            hs.add(c);
        }
        
        for(char c: hs){
            
            int startInd = -1;
            int endInd = 0;
            
            for(int i=0; i<s.length(); i++){
             
                if(s.charAt(i) == c){
                    
                    if(startInd == -1){
                        startInd = i;
                    }
                    
                    endInd = i;
                    
                    
                }
                
            }
            
            newHs.clear();
            
            for(int k=startInd+1; k<endInd; k++){
                newHs.add(s.charAt(k));
            }
            
            ans += newHs.size();
            
        }
        
        return ans;
    }
}