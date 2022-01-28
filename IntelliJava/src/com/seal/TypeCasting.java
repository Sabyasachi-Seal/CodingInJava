package com.seal;
import java.util.Scanner;

// Java Follows the Unicode principles so it can be used to represent any character. I Can even use Bengali or any other Character

public class TypeCasting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a Float: ");
//        float num = input.nextFloat();
//        System.out.println();
//        System.out.print("The Number is "+num);
//        System.out.print("Enter a Float: ");
        //int num = input.nextInt();
        System.out.println();

        //casting the type to int
        int num = (int)55.5f;
        System.out.println("The Number is "+num);

        //automatic type promotion in expressions
        int a = 257;
        byte b = (byte)a;
        System.out.println(b);// Answer is 1 since 257 is greater than 256 , so the value is 267%256=1

        byte n1 = 10;
        byte n2 = 40;
        byte n3 = 100;
        int n4 = n1*n2/n3; // We can store the result of division in int since int is bigger than byte
        System.out.println(n4);/* the multiplication result is 40*10=400 which is bigger than max byte size of 256,
        but the intermediate result of that operation is stored int n4, so the result is 400/100=4*/

        int d = 'A';
        System.out.println(d);// It will print the ASCII value of A. It is possible only because char is smaller than int

        byte b2 = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d2 = 0.1234;
        double result = (f * b2) + (i / c) - (d2 * s);
        // float + int - double = double
        System.out.println((f * b2) + " " + (i / c) + " " + (d2 * s));
        System.out.println(result);
    }

}
