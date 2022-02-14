/* https://leetcode.com/problems/shuffle-the-array/ */

/* https://leetcode.com/problems/shuffle-the-array/ */

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];
        for(int i=0; i<ans.length; i+=2){
            ans[i] = nums[i/2];
            ans[i+1] = nums[i/2 + n];
        }
    return ans;
    }
}

//

// class Solution {
//     public int[] shuffle(int[] nums, int n) {
//         int[] ans = new int[2*n];
//         for(int i=0; i<ans.length; i++){
//             if(i%2==0){
//                 ans[i] = nums[i/2];
//             }
//             else{
//                 ans[i] = nums[n+i/2];
//             }
//         }
//     return ans;
//     }
// }
