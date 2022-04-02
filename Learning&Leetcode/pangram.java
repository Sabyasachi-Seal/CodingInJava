// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

class pangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = checkIfPangram(s);
        System.out.println(ans);
    }
    public static boolean checkIfPangram(String sentence) {
        int chr;
        int arr[] = new int[26];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }
        for(int i=0; i<sentence.length(); i++){
            chr = (int)sentence.charAt(i); 
            // System.out.println(chr+"-"+sentence.charAt(i));
            arr[chr-97] = 1;
        }
        for(int i=0; i<arr.length; i++){
            // System.out.println(arr[i]);
            if(arr[i] == -1){
                return false;
            }
        }
        return true;
    }
}