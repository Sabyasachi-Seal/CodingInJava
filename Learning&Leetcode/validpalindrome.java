// https://leetcode.com/problems/valid-palindrome-ii/
class validpalindrome {
    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        // int left, right;
        // for(int i=0; i<s.length(); i++){
        //     left = 0;
        //     right = s.length()-1;
        //     while(left<right){
        //         if(s.charAt(left)==s.charAt(right)){
        //             left++;
        //             right--;
        //         }
        //         else if(s.charAt(left)!=s.charAt(right)){
        //             break;
        //         }
        //         return true;
        //     }
        // }
        // return false;
        for(int i=0; i<s.length(); i++){
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);
            sb.reverse();
            // String temp2 = sb.toString();
            // System.out.println(temp);
            // System.out.println(temp2);
            if((sb.toString()).equals((sb.reverse()).toString())){
                return true;
            }
            // int left =0;
            // int right = sb.length();
            // while(left<right){
            //     if(s.charAt(left)==s.charAt(right)){
            //         left++;
            //         right--;
            //     }
            //     else if(s.charAt(left)!=s.charAt(right)){
            //         break;
            //     }
            //     return true;
            // }
        }
        return false;
    }
}