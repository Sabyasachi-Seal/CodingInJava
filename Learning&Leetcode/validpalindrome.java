// https://leetcode.com/problems/valid-palindrome-ii/
class validpalindrome {
    public static void main(String[] args) {
        String s = "raicecar";
        System.out.println(valid(s));
    }
    public static boolean valid(String s) {
        for(int i=0; i<s.length()/2; i++){
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);
            if(ispalindrome(sb.toString())){
                return true;
            }
        }
        return false;
    }
    public static boolean ispalindrome(String s){
        for(int i=0; i<s.length()/2; i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}