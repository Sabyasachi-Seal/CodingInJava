import java.lang.Math;
public class sqrtx {
    public static int mySqrt(int x) {
        int s=0, e=x, ans = 0;
        while(s<=e){
            int mid = s+ (e-s)/2;
            System.out.println(mid);
            if(mid<=x/mid){
                s = mid+1;
                ans = mid;
            }
            else{
                e = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
}

