import java.lang.Thread.State;

// https://leetcode.com/problems/arranging-coins/
public class arrangingcoins {
    public static int arrangeCoins(int n) {
        // int curr = 1;
        // while(n>=curr){
        //     n-= curr;
        //     curr++;
        // }
        // return curr-1;
        // int start = 0, end = n, mid=1;
        // int c=0;
        // while(start<=end){
        //     c++;
        //     mid = start + (end-start)/2;
        //     if(mid<n){
        //         start = mid + 1;
        //     }
        //     else{
        //         end = mid - 1;
        //     }
        // }
        // return c-1;
        int next = 1;
        int count = 1;
        while(n-next>=0){
            next += ++count;
        }
        return count-1;
    }
    public static void main(String[] args) {
        int n = 9;
        System.out.println(arrangeCoins(n));
    }
}
