// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class twosum2{
    public static int[] twoSum(int[] numbers, int target) {
        int start = 0; 
        int end = numbers.length-1;
        int mid = 1;
        int ans[] = new int[2];
        for(int i=0; i<numbers.length; i++){
            int rem = target-numbers[i];
            while(start<=end){
                mid = start + (end-start)/2;
                if(numbers[mid]==rem){
                    ans[1] = mid+1;
                    ans[0] = i+1;
                    return ans;
                }
                else if(numbers[mid]<rem){
                    start = mid+1;
                }
                else{
                    end = mid - 1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5, 25, 75};
        int target = 100;
        int ans[] = twoSum(arr, target);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}