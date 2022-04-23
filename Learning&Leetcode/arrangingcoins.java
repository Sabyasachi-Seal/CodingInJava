// https://leetcode.com/problems/arranging-coins/
public class arrangingcoins {
    public static int arrangeCoins(int n) {
        // int curr = 1;
        // while(n>=curr){
        //     n-= curr;
        //     curr++;
        // }
        // return curr-1;
        long start = 0, end = n, mid=1;
        while(start<=end){
            mid = start + (end-start)/2;
            if((mid+1)*mid/2==n){
                return (int)mid;
            }
            else if((mid+1)*mid/2<n){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return (int)end ;
        // int next = 1;
        // int count = 1;
        // while(n-next>=0){
        //     next += ++count;
        // }
        // return count-1;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(arrangeCoins(n));
    }
}
