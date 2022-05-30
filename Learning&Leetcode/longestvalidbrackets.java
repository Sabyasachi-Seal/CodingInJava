// https://leetcode.com/problems/longest-valid-parentheses/
import java.util.*;
public class longestvalidbrackets {
    public static int longestValidParentheses(String s){
        Stack<Character> ct = new Stack<>();
        Stack<Integer> index = new Stack<>();
        int max = 0; 
        index.add(-1);
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                ct.add('(');
                index.add(i);
            }
            else{
                if(!ct.isEmpty() && ct.peek()=='('){
                    ct.pop();
                    index.pop();
                    max = Math.max(max, i-index.peek());
                }
                else{
                    index.add(i);
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String s = "(())(";
        System.out.println(longestValidParentheses(s));
    }

}
