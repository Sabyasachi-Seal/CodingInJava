// https://leetcode.com/problems/kth-missing-positive-number/

class missingnum {
    public static int findKthPositive(int[] arr, int k) {
        int start = 0, end=arr.length, mid =1;
        while(start<end){
            mid = start + (end-start)/2;
            if(arr[mid]-(mid+1)>=k){
                end = mid;
            }
            else{
                start = mid +1;
            }
        }
        return start+k;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 5;
        System.out.println(findKthPositive(arr, k));
    }
}
