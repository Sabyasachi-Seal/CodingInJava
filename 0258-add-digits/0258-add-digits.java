class Solution {
    public int addDigits(int num) {
        while(num>9){
            
            // here add the digits
            int sum = 0;
            while(num>0){
                sum += num %10;
                num /= 10;
            }
            // System.out.println(sum);
            num=sum;
            
        }
        return num;
    }
}