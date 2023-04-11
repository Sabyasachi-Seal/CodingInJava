class Solution {
    public String removeStars(String s) {
        
        // can use a stack
        
        StringBuilder ans = new StringBuilder();
        
        for(char c: s.toCharArray()){
            
            if(c == '*'){
                ans.deleteCharAt(ans.length()-1);
            }
            else ans.append(c);
            
        }
        
        return ans.toString();
    }
}