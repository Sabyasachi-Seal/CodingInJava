// https://leetcode.com/problems/valid-palindrome/
public class validpalindromeone {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        for(char c: s.toCharArray()){
            if((c>=97 && c<= 122) || (c>=48 && c<=57)){
                str.append(c);
            }
            else if((c>=65 && c<=90)){
                str.append(Character.toLowerCase(c));
            }
        }
        return isitpali(str.toString());
    }
    public static boolean isitpali(String s){
        int left = 0;
        int right = s.length();
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
