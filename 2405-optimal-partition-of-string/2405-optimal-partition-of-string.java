class Solution {
    public int partitionString(String s) {
        
        // slidng window
        // use hashsets for the window
        
        HashSet<Character> curr = new HashSet<>();
        
        int ans = 1;
        
        int windowStart = 0;
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(curr.contains(ch)){
                ans++;
                curr = new HashSet<>();
                curr.add(ch);
                // System.out.println("-");
            }
            else{
                curr.add(ch);
            }
            // System.out.println(Arrays.asList(curr));
        }
        
        return ans;
        
    }
}