class Solution {
    public int romanToInt(String s) {
        
        
        HashMap<Character, Integer> hm = new HashMap<>();
        
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        
        int ans = 0;
        
        for(int i=s.length()-1; i>=0; i--){
            
            char c = s.charAt(i);
            
            ans += hm.get(c);
            
            if((c=='V' || c=='X') && i>0 && s.charAt(i-1) == 'I' ){        
                ans--;
                i--;
            }
            if((c=='L' || c=='C') && i>0 && s.charAt(i-1) == 'X' ){
                ans-=10; 
                i--;
            } 
            if((c=='D' || c=='M') && i>0 && s.charAt(i-1) == 'C' ){
                ans-=100;
                i--;
            }  
            
        }
        
        return ans;
    }
}