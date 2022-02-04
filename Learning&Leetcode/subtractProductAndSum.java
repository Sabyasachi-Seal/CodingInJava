/*Given an integer number n, return the difference between the product of its digits and the sum of its digits.  */
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while(n>0){
            int last = n%10;
            sum += last;
            product *= last;
            n /= 10;
        }
        return (product-sum);
    }
}