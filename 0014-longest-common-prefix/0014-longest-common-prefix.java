class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int ans = 0;
        
        int maxLen = Integer.MAX_VALUE;
        
        for(String s: strs){
            maxLen = Math.min(maxLen, s.length());
        }
        
        Outer: 
        for(int strC=0; strC<maxLen; strC++){
        
            if(strC >= strs[0].length()) break;
            
            char currPref = strs[0].charAt(strC);
            
            for(int i=1; i<strs.length; i++){
                
                if (strC >= strs[i].length() || currPref != strs[i].charAt(strC)){
                    break Outer;
                }
            }    
            
            ans++;
        }
        
        return strs[0].substring(0, ans);
        
    }
}