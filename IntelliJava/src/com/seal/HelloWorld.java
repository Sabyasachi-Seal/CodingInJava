package com.seal;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int a = input.nextInt();
	    System.out.print("The number is "+a);
        int b = 234_000_000;
        System.out.println(b);
        float c = 67.67f;
        System.out.println(c);
    }
}
