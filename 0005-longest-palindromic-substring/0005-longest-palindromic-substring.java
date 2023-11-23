class Solution {
    public String longestPalindrome(String s) {
        
        // generate all substrings
        
        if(s.length()<=1) return s;
        
        String ans = "";
        
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
                
                if(isPalindrome(s, i, j)){
                    
                    // System.out.println(i+" "+j);
                    
                    if(j - i + 1 > ans.length()){
                        ans = s.substring(i, j+1);
                    }
                    
                }
            }
        }
        
        return ans;
        
        
    }
    private boolean isPalindrome(String s, int i, int j){
        
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        
        return true;
    }
}