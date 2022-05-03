import java.util.*;;
// https://leetcode.com/problems/find-right-interval/
class rightinterval {
    // public static int[] findRightInterval(int[][] intervals) {
    //     int[] ans = new int[intervals.length];
    //     // Arrays.sort(intervals);
    //     if(intervals.length<2){
    //         ans[0] = -1;
    //         return ans;
    //     }
    //     int[] starts = new int[intervals.length];
    //     int[] ends = new int[intervals.length];
    //     for (int i = 0; i < ans.length; i++) {
    //         starts[i] = intervals[i][0];
    //         ends[i] = intervals[i][1];
    //     }
    //     for (int i = 0; i < ends.length; i++) {
    //         ans[i] = binary2(starts, 0, ends.length-1, ends[i]);
    //     }
    //     // if(starts[0]>starts[1]){
    //     //     for (int i = 0; i < ends.length; i++) {
    //     //         ans[i] = binary1(starts, 0, ends.length-1, ends[i]);
    //     //     }
    //     // }
    //     // else{
    //     //     for (int i = 0; i < ends.length; i++) {
    //     //         ans[i] = binary2(starts, 0, ends.length-1, ends[i]);
    //     //     }
    //     // }
    //     return ans;
    // }
    // public static int binary1(int[] arr, int start, int end, int target){
    //     int mid;
    //     while(start<=end){
    //         mid = start + (end-start)/2;
    //         if(arr[mid]>=target){
    //             return mid;
    //         }
    //         else if(arr[mid]>target){
    //             start = mid + 1;
    //         }
    //         else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }
    // public static int binary2(int[] arr, int start, int end, int target){
    //     int mid;
    //     while(start<=end){
    //         mid = start + (end-start)/2;
    //         if(arr[mid]==target){
    //             return mid;
    //         }
    //         else if(arr[mid]<target){
    //             start = mid + 1;
    //         }
    //         else{
    //             end = mid - 1;
    //         }
    //     }
    //     return -1;
    // }
    public static int[] findRightInterval(int[][] intervals) {
        int[] ans = new int[intervals.length];
        int min,ind;
        for (int i = 0; i < ans.length; i++) {
            min = Integer.MAX_VALUE;
            ind = -1;
            for (int j = 0; j < ans.length; j++) {
                if(intervals[j][0] >= intervals[i][1] && min > intervals[j][0]){
                    ind = j;
                    min = intervals[j][0];
                }
            }
            ans[i] = ind;
        }
        return ans;
    }
    public static void main(String[] args) {
        // int[][] arr = {{3,4},{2,3},{1,2}};
        // int[][] arr = {{1,4},{2,3},{3,4}};
        // int[][] arr = {{4,5},{2,3},{1,2}};
        // int[][] arr = {{1,2},{2,3},{0,1},{3,4}};
        int[][] arr = {{1,12},{2,9},{3,10},{13,14},{15,16},{16,17}};
        int[] ans = findRightInterval(arr);
        for(int i =0; i<ans.length; i++){
            System.out.println(ans[i]);
        }
    }
}