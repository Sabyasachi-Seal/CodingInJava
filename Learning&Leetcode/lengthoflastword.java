public class lengthoflastword {
    public int lengthOfLastWord(String s) {
        // return s.split(" ")[s.split(" ").length -1].length();
        int i;
        int len = 0;
        for (i = s.length()-1; i >=0 ; i--) {
            if(s.charAt(i) != ' ') len++;
            else{
                if(len>0) return len;
            }
        }
        return len;
    }
}
