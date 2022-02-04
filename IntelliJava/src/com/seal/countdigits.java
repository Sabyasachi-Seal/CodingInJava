package com.seal;
import java.util.Scanner;
public class countdigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int temp = num;
        System.out.println("Enter the digit you want to count: ");
        int digit = input.nextInt();
        int count = 0;
        while(num>0){
            int last = num%10;
            if(last==digit){
                count++;
            }
            num = num/10;
        }
        System.out.println("The number of times "+digit+" is present in "+temp+" is "+count);
    }
}