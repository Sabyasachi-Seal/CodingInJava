import javax.swing.text.html.HTML.Tag;
import javax.swing.text.html.parser.TagElement;

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class twosum2{
    public static int[] twoSum(int[] numbers, int target) {
        // int start, i, rem; 
        // int end = numbers.length-1;
        // int mid=1;
        // int ans[] = new int[2];
        // for(i=0; i<numbers.length; i++){
        //     rem = target-numbers[i];
        //     start = i;
        //     while(start<=end){
        //         mid = start + (end-start)/2;
        //         if(mid == i){
        //             start++;
        //             continue;
        //         }
        //         else if(numbers[mid]==rem){
        //             ans[1] = mid+1;
        //             ans[0] = i+1;
        //             return ans;
        //         }
        //         else if(numbers[mid]<rem){
        //             start = mid+1;
        //         }
        //         else{
        //             end = mid-1;
        //         }
        //     }
        // }
        // ans[1] = mid;
        // ans[0] = i;
        // return ans;
        int ans[] = new int[2];
        int front = 0;
        int back = numbers.length-1;
        int total = numbers[front]+numbers[back];
        while(total!=target){
            if(total<target){
                front++;
            }
            else if(total>target){
                back--;
            }
            total = numbers[front]+numbers[back];
        }
        ans[0]=front+1;
        ans[1]=back+1;
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,4,9,56,90};
        int target = 8;
        int ans[] = twoSum(arr, target);
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}