// https://leetcode.com/problems/remove-palindromic-subsequences/
public class removepalindromesubs {
    public static int removePalindromeSub(String s) {
        if(s.length()==0) return 0;
        else if(ispalindrome(s)) return 1;
        else return 2;
    }
    public static boolean ispalindrome(String str){
        int front = 0;
        int back = str.length()-1;
        while(front<=back){
            if(str.charAt(front)==str.charAt(back)){
                front++;
                back--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "bbaabb";
        System.out.println(removePalindromeSub(s));
    }
}
