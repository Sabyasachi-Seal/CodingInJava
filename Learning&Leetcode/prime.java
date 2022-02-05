import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isprime(n));
    }
    static boolean isprime(int n){
        if(n>2){
            int count = 2;
            while(count*count<=n){
                if(n%count==0){
                    return false;
                }
                count++;
            }
            return count*count>n;
        }
        return false;
    }
}

