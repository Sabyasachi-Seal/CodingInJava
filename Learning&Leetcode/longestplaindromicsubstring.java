// https://leetcode.com/problems/longest-palindromic-substring/
public class longestplaindromicsubstring {
    public static String longestPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder();
        int left = 0, right = s.length();
        int i = 0;
        while(left<=right){
            String temp = s.substring(left, right);
            if(ispali(temp)){
                sb1 = sb1.append(temp);
                break;
            }
            else if(i%2==0){
                right--;
            }
            else{
                left++;
            }
            i++;
        }
        left = 0;
        right = s.length();
        i = 0;
        while(left<=right){
            String temp = s.substring(left, right);
            if(ispali(temp) && temp.length()>sb1.length()){
                sb1.delete(0, sb1.length());
                sb1 = sb1.append(temp);
                break;
            }
            else if(i%2==0){
                left++;
            }
            else{
                right--;
            }
            i++;
        }
        left = 0;
        right = s.length();
        while(left<=right){
            String temp = s.substring(left, right);
            if(ispali(temp) && temp.length()>sb1.length()){
                sb1.delete(0, sb1.length());
                sb1 = sb1.append(temp);
                break;
            }
            left++;
        }
        left = 0;
        right = s.length();
        while(left<=right){
            String temp = s.substring(left, right);
            if(ispali(temp) && temp.length()>sb1.length()){
                sb1.delete(0, sb1.length());
                sb1 = sb1.append(temp);
                break;
            }
            right--;
        }
        return sb1.toString();
    }
    public static boolean ispali(String s){
        int left = 0, right = s.length()-1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "eabcb";
        System.out.println(longestPalindrome(s));
    }
}
