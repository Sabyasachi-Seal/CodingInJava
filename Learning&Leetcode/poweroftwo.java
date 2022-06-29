public class poweroftwo {
    public boolean isPowerOfTwo(int n) {
        if(n==1) return true;
        return twokabaccha(n);
    }
    public boolean twokabaccha(int n){
        if (n==0) return false;
        else if (n==1) return true;
        else return (n%2==0) && twokabaccha(n/2);
    }
}
