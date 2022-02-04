package com.seal;
import java.util.Scanner;
public class ReverseNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to reverse: ");
        int number = input.nextInt();
        int reverse  = 0;
        while(number > 0){
            int last = number % 10;
            reverse *= 10;
            reverse += last;
            number /= 10;
        }
        System.out.println("The reverse is "+ reverse);
    }
}