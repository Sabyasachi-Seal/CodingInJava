// https://leetcode.com/problems/valid-perfect-square/submissions/
public class perefctsquare {
    public static boolean isPerfectSquare(int num) {
        int start = 0, end = num;
        float mid;
        while(start<=end){
            mid = start + (end - start)/2;
            if((float)mid==(float)num/mid){
                return true;
            }
            else if((float)mid<(float)num/mid){
                start = (int)mid+1;
            }
            else{
                end = (int)mid -1;
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        int n = 2-1;
        System.out.println(isPerfectSquare(n));
    }
}
