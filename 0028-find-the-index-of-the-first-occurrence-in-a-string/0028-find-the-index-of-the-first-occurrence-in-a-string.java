class Solution {
    public int strStr(String h, String n) {
        // traverse like a sliding window
        
        if(h.length() < n.length()) return -1;
        
        for(int i = 0; i<h.length(); i++){
            
            int ni = 0;
            int hi = i;
            while(hi<h.length() && ni<n.length() && h.charAt(hi) == n.charAt(ni)){
                ni++;
                hi++;
                if(ni == n.length()) return i;
            }
            
        }
        
        return -1;
    }
}