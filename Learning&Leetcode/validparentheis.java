import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class validparentheis {
    public boolean isValid(String s) {
        Stack<Character> apnastack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch == '('){
                apnastack.push(')');
            }
            else if(ch == '{'){
                apnastack.push('}');
            }
            else if(ch == '['){
                apnastack.push(']');
            }
            else if(apnastack.isEmpty() || apnastack.pop() != ch){
                return false;
            }
        }
        return apnastack.isEmpty();
    }
}
