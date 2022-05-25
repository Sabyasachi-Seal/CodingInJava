// https://leetcode.com/problems/longest-valid-parentheses/
import java.util.*;
public class longestvalidbrackets {
    // public static int longestValidParentheses(String s) {
    //     int count = 0;
    //     int opens = 0;
    //     int closes = 0;
    //     int max = 0;
    //     for (int i = 0; i < s.length();) {
    //         opens = 0;
    //         closes = 0;
    //         while(i<s.length() && s.charAt(i)=='('){
    //             opens++;
    //             i++;
    //             if(i<s.length() && s.charAt(i) == ')'){
    //                 closes++;
    //                 count++;
    //                 i++;
    //             }
    //         }
    //         while(i<s.length() && s.charAt(i)==')'){
    //             closes++;
    //             i++;
    //         }
    //         if(opens==closes && 2*count<s.length()){
    //             count += Math.min(opens, closes);
    //         }
    //         else{
    //             count = Math.min(opens, closes);
    //         }
    //         if(max<count){
    //             max = count;
    //         }
    //     }
    //     return 2*max;   
    // }
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
