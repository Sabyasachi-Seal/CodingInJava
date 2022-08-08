import java.util.ArrayList;

class longestincreasingsubsequence{
    static int max = 0;
    public static void main(String[] args) {
        longestincreasingsubsequence o = new longestincreasingsubsequence();
        int []arr = {0,3,1,6,2,2,7};
        System.out.println(o.lengthOfLIS(arr));
        // System.out.println(max);
    }
    public int lengthOfLIS(int[] nums) {
        return subs(nums, 0, -1);
    }
    public int subs(int arr[], int i, int prev){
        if(i == arr.length){
            return 1;
        }
        if(prev == -1) prev = arr[i];
        int take = 0;
        if(arr[i] > prev) {
            take = 1 + subs(arr, i+1, arr[i]);
        }
        int nottake = subs(arr, i+1, prev);
        return Math.max(take, nottake);
    }
    public boolean isincreasing(ArrayList<Integer> ans){
        for (int i = 0; i < ans.size()-1; i++) {
            if(ans.get(i)>=ans.get(i+1)) return false; 
        }
        return true;
    }
}