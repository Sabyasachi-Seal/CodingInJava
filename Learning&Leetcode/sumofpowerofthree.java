public class sumofpowerofthree {
    public boolean checkPowersOfThree(int n) {
        return three(n);
    } 
    public static boolean three(int n){
        if(n==0 || n==1) return true;
        else if(n%3 == 2) return false;
        else return three(n/3);
    }
}
