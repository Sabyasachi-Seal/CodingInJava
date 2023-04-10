class Solution {
    public boolean isValid(String s1) {
        
        Stack <Character> c = new Stack<>();
        
        boolean open = false;
        
        for(int i=0; i<s1.length(); i++){
            
            // System.out.println(Arrays.asList(c));
            
            char s = s1.charAt(i);
                
            if(s == ')' || s=='}' || s==']'){
                
                if(!c.isEmpty()){
                    
                    if(s == ')' && c.peek() != '(') return false;
                    
                    if(s == '}' && c.peek() != '{') return false;
                    
                    if(s == ']' && c.peek() != '[') return false;
                    
                    c.pop();
                }
                else return false;
                
            }
            else{
                
                open = true;
                
                c.push(s);
            }
            
        }
               
        return c.isEmpty() && open;
        
    }
}