
public class primesetbits {
    public int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            int t = getset(i);
            if(t==2||t==3||t==5||t==7||t==11||t==13||t==17||t==19) ans ++;
        }
        return ans;
    }
    public int getset(int n){
        int ans = 0;
        while(n>0){
            ans += (n&1);
            n >>>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
    }
}
