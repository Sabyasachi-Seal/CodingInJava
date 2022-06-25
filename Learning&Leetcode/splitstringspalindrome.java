public class splitstringspalindrome {
    public static boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check (b, a);
    }
    public static boolean check(String a, String b){
        int left = 0;
        int right = a.length()-1;
        while(left < right){
            if(a.charAt(left) != b.charAt(right)){
                return ispalindrome(a, left, right) || ispalindrome(b, left, right);
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean ispalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
