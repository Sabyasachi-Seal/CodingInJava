// https://leetcode.com/problems/jump-game/
// https://www.youtube.com/watch?v=Yan0cv2cLy8
public class canjump {
    public static boolean canJump(int[] nums) {
        int goalpost = nums.length-1;
        for (int j = goalpost; j >= 0; j--) {
            if(j + nums[j] >= goalpost){
                goalpost = j;
            }
            if(goalpost == 0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 0, 4};
        System.out.println(canJump(arr));
    }
}
