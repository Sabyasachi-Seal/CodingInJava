// https://leetcode.com/problems/kth-missing-positive-number/

class missingnum {
    public static int findKthPositive(int[] arr, int k) {
        for(int i=0; i<arr.length; i++){
            if((arr[i]-(i+1))>=k){
                return k+i;
            }
        }
        return arr.length+k;
        
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
}
