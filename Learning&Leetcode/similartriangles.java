/*Given a list of pairs representing similar triangles and an input triangle, your task is to figure out the total no of triangles similar to given input.

Example testcase:
[(A,B);(B,D);(D,E);(A,F)]
Input triangle:F
No of triangles similar to triangle F:4
Explanation: F similar to A,B,C,D. */
import java.util.*;
public class similartriangles {
    public static int triangle(char[][] tri, char t){
        Arrays.sort(tri, (i1, i2) -> Character.compare(i1[0], i2[0]));
        HashMap<Character, Character> hm = new HashMap<>();
        for (int i = 0; i < tri.length; i++) {
            if(!hm.containsKey(tri[i][0])) hm.put(tri[i][0], tri[i][1]);
            else{
                count ++;
            }
        }
        return 5;
    }
    public static void main(String[] args){
        char[][] t = new char[][]{{'A','B'}, {'B','D'}, {'D','E'}, {'A', 'F'}};
        System.out.println(triangle(t, 'F'));
    }
}
