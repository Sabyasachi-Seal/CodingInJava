// https://leetcode.com/problems/binary-trees-with-factors/
import java.util.*;
public class binarytreefactors {
    private int mod = 1000000007;
    protected int numFactoredBinaryTrees(int[] arr) {
        HashMap<Integer, Long> factor = new HashMap<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            factor.put(arr[i], 1L);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] % arr[j] == 0 && factor.containsKey(arr[i]/arr[j])){
                    factor.put(arr[i], factor.get(arr[i])%mod + (factor.get(arr[j])*factor.get(arr[i]/arr[j]))%mod);
                }
            }
        }
        long sum = 0;
        for (int i = 0; i < factor.size(); i++) {
            sum = (sum + factor.get(arr[i]))%mod;
        }
        return (int)sum;
    }
    public static void main(String[] args) {
        binarytreefactors o = new binarytreefactors();
        int[] arr = {18,3,6,2};
        System.out.println(o.numFactoredBinaryTrees(arr));
    }
}
