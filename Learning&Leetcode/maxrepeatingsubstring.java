public class maxrepeatingsubstring {
    // public static int maxRepeating(String sequence, String word) {
    //     int max = 0;
    //     int count = 0;
    //     int i = 0;
    //     while(i <= sequence.length()-word.length()) {
    //         // System.out.println(sequence.substring(i, i+word.length()));
    //         if(sequence.substring(i, i+word.length()).equals(word)){
    //             i += word.length();
    //             count++;
    //         }
    //         else{
    //             count = 0;
    //             i++;
    //         }
    //         max = Math.max(max, count);
    //     }
    //     i = sequence.length()-word.length();
    //     count = 0;
    //     while(i>=word.length()){
    //         System.out.println(sequence.substring(i-word.length(), i));
    //         if(sequence.substring(i-word.length(), i).equals(word)){
    //             i -= word.length();
    //             count++;
    //         }
    //         else{
    //             count = 0;
    //             i--;
    //         }
    //         max = Math.max(max, count);
    //     }
    //     return max;
    // }
    public static int maxRepeating(String sequence, String word){
        StringBuilder sb = new StringBuilder(word);
        int count = 0;
        while(sequence.contains(sb.toString())){
            count++;
            sb.append(word);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba", "aaaba"));
    }
}
