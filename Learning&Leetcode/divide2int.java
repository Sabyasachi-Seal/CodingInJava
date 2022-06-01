// https://leetcode.com/problems/divide-two-integers/
public class divide2int {
    public static int divide(int dividend, int divisor) {
        if(divisor==Integer.MIN_VALUE && dividend==Integer.MAX_VALUE){
            return 0;
        }

        if(divisor==1) return dividend;

        if(dividend>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        else if(dividend<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }


        int count = 0;
        int num, div;

        if(dividend == Integer.MIN_VALUE){
            if(Math.abs(divisor)%2==0) count = 1;
            num = Integer.MAX_VALUE;
        }
        else if(dividend<0){
            num = dividend*-1;
        }
        else{
            num = dividend;
        }


        if(divisor == Integer.MIN_VALUE){
            div = Integer.MAX_VALUE;
        }
        else if(divisor<0){
            div = divisor*-1;
        }
        else{
            div = divisor;
        }
        
       
        if(Math.abs(divisor)!=1){
            while(num >= div){
                count++;
                num -= div;
            }
        }
        else {
            count = num;
        }


        if(dividend < 0  && divisor<0){
            return count;
        }
        else if(dividend<0  && divisor>0){
            return -count;
        }
        else if(dividend>0 && divisor<0){
            return -count;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(divide(-2147483648, 2));
    }
}
