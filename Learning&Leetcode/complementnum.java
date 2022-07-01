public class complementnum {
    public static int findComplement(int num) {
        int ans = 0;
        int pos = 0;
        String number = Integer.toBinaryString(num);
        for (int i = number.length()-1; i >= 0; i--) {
            ans += ((number.charAt(i)^1)-'0') * Math.pow(2, pos);
            pos ++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}
