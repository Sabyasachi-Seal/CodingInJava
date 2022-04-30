import javax.xml.transform.Source;

// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class movechips {
    public static int minCostToMoveChips(int[] position) {
        int odd = 0;
        for(int num: position){
            if((num&1)==1){
                odd++;
            }
        }
        if(position.length-odd==0){
            return 0;
        }
        return (odd>position.length-odd)?odd:position.length-odd;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        System.out.println(minCostToMoveChips(arr));
    }
}
