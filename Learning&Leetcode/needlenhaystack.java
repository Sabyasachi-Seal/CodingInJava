class Solution {
    public static int strStr(String haystack, String needle) {
        return issubstring(haystack, needle);
    }
    public static int issubstring(String word, String s){
        // int l = -1;
        // int r = 0;
        // while(r<word.length()){
        //     if(word.charAt(r) == word.charAt(r)){
        //         if(l==-1) l =0;
        //         r++;
        //     }
        //     else{
        //         l++;
        //         r = l;
        //     }
        // }
        // return l;
        if(word.equals(s)) return 0;
        for(int i =0; i<=word.length()-s.length(); i++){
            if(word.substring(i, i+s.length()).equals(s)){
                return i;
            }
        }
        return -1;
    }
}