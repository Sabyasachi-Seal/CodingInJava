public class alternatingbits {
    public boolean hasAlternatingBits(int n) {
        int i = (n&1);
        while(n>=0){
            if((n&1) == i){
                i ^= 1;
                n >>= 1;
            }
            else return false;
        }
        return true;
    }
}
