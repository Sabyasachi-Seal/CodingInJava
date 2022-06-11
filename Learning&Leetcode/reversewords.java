// https://leetcode.com/problems/reverse-words-in-a-string-iii/
public class reversewords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            words[i] = reverse(words[i]);
        }
        return String.join(" ", words);
    }
    public static String reverse(String s){
        StringBuilder temp = new StringBuilder();
        for (int i = s.length()-1; i >=0; i--) {
            temp.append(s.charAt(i));
        }
        return temp.toString();
    }
}
