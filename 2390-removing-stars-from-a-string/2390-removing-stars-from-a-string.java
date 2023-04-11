class Solution {
    public String removeStars(String s) {
        // can use a stack
        
        Stack<Character> stk = new Stack<>();
        
        for(char c: s.toCharArray()){
            
            if(c == '*'){
                stk.pop();
            }
            else stk.push(c);
            
        }
        
        StringBuilder ans = new StringBuilder();
        
        while(!stk.isEmpty()){
            ans.append(stk.pop());
        }
        
        ans.reverse();
        
        return ans.toString();
    }
}