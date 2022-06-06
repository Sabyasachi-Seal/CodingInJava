// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
public class EquivalentStrings {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder("");
        StringBuilder w2 = new StringBuilder("");
        for(String c: word1){
            w1.append(c);
        }
        for(String c: word2){
            w2.append(c);
        }
        return w1.toString().equals(w2.toString());
    }
}
