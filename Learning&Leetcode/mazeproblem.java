import java.util.*;
public class mazeproblem {
    public static void main(String[] args) {
        int row = 3, col = 3;
        // maze2("", row, col);
        boolean cango[][] = new boolean[row][col];
        for (int i = 0; i < cango.length; i++) {
            for (int j = 0; j < cango[0].length; j++) {
                cango[i][j] = true; 
            }
        }
        maze3("Start-> ", 0, 0, cango, new int[row][col], 1);
        // System.out.println(maze(new ArrayList<>(), "", 3, 3));
    }
    public static List<String> maze(List<String> ans, String path, int row, int col){
        if(row == 1 && col == 1){
            ans.add(path);
            return ans;
        }
        if(row>1) maze(ans, path+'D', row-1, col);
        if(col>1) maze(ans, path+'R', row, col-1); 
        return ans;
    }
    public static void maze2(String path, int row, int col){
        if(row == 1 && col == 1){
            System.out.println(path);
            return;
        }
        if(row>1 && col>1) maze2(path+'d', row-1, col-1);
        if(row>1) maze2(path+'D', row-1, col);
        if(col>1) maze2(path+'R', row, col-1); 
    }


    public static void maze3(String path, int row, int col, boolean[][] cango, int arr[][], int step){
        if(row == cango.length-1 && col == cango[0].length-1){
            arr[row][col] = step;
            for (int[] a : arr) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(path+"Destination.");
            System.out.println("\n");
            return;
        }

        if(!cango[row][col]){
            return;
        }
        else cango[row][col] = false;
        
        arr[row][col] = step;
 
        if(row<cango.length-1) maze3(path+"Down-> ", row+1, col, cango, arr, step+1);
        if(col<cango.length-1) maze3(path+"Right-> ", row, col+1, cango,arr, step+1);
        if(row>0) maze3(path+"Up-> ", row-1, col, cango, arr, step+1);
        if(col>0) maze3(path+"Left-> ", row, col-1, cango, arr, step+1);

        cango[row][col] = true;
        arr[row][col] = 0;

    }
}
