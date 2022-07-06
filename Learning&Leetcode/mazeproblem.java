import java.util.*;
public class mazeproblem {
    public static void main(String[] args) {
        maze2("", 3, 3);
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
}
