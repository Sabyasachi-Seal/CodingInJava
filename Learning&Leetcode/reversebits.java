class reversebits{
    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int end = n&1;
            n = n>>1;
            result = result<<1;
            result = result | end;
        }
        return result;
    }
}