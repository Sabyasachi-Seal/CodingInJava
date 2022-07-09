class substrings{
    public static void main(String[] args) {
        substring("abcd");
    }
    public static String substring(String s){
        if(s.length()<2){
            return "";
        }
        System.out.println(s);
        for (int i = 0; i < s.length(); i++) {
            substring(s.substring(0, i));
            
            substring(s.substring(i+1, s.length()));
        }
        return s;
    }
}