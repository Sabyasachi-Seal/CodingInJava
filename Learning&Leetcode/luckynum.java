import java.time.chrono.MinguoChronology;
import java.util.*;
public class luckynum {
    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        int mincol = 0;
        for(int i=0; i<matrix.length; i++){
            mincol = mincolinrow(matrix, i);
            if(maxinrow(matrix, mincol, matrix[i][mincol])){
                result.add(matrix[i][mincol]);
            }
        }
        return result;
    }
    public static int mincolinrow(int[][] matrix, int row){
        int minind = 0, min = matrix[row][minind]; 
        for (int i = 0; i < matrix[row].length; i++) {
            if(min>matrix[row][i]){
                min = matrix[row][i];
                minind = i;
            }
        }
        return minind;
    }
    public static boolean maxinrow(int[][] matrix, int mincol, int target){
        for (int i = 0; i < matrix.length; i++) {
            if(target < matrix[i][mincol]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] arr = {{3,7,8},{9,11,13},{15,16,17}};
        List <Integer> ans = luckyNumbers(arr);
        for(int i =0; i<ans.size(); i++){
            System.out.println(ans.get(i));
        }
    }

}
