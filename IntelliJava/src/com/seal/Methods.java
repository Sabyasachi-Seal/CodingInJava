package com.seal;
import java.util.Scanner;
public class Methods {
    public static void main(String[] args){
        int count = 0;
        while(count<2){
            greeting();
            int ans = sum();
            System.out.println("Sum = "+ans);
            count++;
        }
    }
    static void greeting(){
        System.out.println("Function Call, Hello World!");
    }
    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int ans = a+b;
        return ans;
    }
}
