public class binarygap {
    public static int binaryGap(int n) {
        String num = Integer.toBinaryString(n);
        int start = num.indexOf('1');
        int max = 0;
        for (int i = start; i < num.length(); i++) {
            if(num.charAt(i) == '1') {
                max = Math.max(max, i-start);
                start = i;
            }   
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }
}
