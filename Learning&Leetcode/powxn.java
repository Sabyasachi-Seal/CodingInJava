// https://leetcode.com/problems/powx-n/
public class powxn {
    public static double myPow(double x, int n) {
        double temp = x;
        if(x==1.0) return x;
        if(n==0) return 1; 
        if(n>0){
            for (int i = 0; i < n-1; i++) {
                x = x * temp;
            }
        }
        else{
            for (int i = 0; i < Math.abs(n)+1; i++) {
                x = x / temp;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(myPow(2.0, -2));
    }
}
