import java.util.Arrays;

class assigncookies {
    public static int findContentChildren(int[] g, int[] s) {
        if(s.length==0) return 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int c = 0;
        for (int i = 0; i < s.length && c<g.length; i++) {
            if(s[i]>=g[c]){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] g= {1, 2};
        int[] s={1, 2, 3};
        System.out.println(findContentChildren(g, s));
    }
}