import javax.xml.transform.Source;

// https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
public class movechips {
    public static int minCostToMoveChips(int[] position) {
        int cost = 0;
        for(int i=1; i<position.length; i++){
            // if(position[i-1]==position[i]){
            //     if(((position[i-1]-position[i])&1)==0){
            //         cost++;
            //     }
            // }
            // else{
            //     if(((position[i]-position[i-1])&1)==0){
            //         cost++;
            //     }
            // }
            if((i&1)==1 && position[i]!=position[i-1]){
                cost++;
            }
        }
        return cost;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 3};
        System.out.println(minCostToMoveChips(arr));
    }
}
