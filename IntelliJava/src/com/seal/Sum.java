package com.seal;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a+b;
        System.out.print("The sum is "+ sum);
    }
}
