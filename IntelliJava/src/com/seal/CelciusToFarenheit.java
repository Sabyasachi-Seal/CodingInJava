package com.seal;
import java.util.Scanner;


public class CelciusToFarenheit {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the temperature in C: ");
        float c_temp = input.nextFloat();
        float f_temp = (c_temp * 9/5) + 32;
        System.out.println();
        System.out.print("The temperature in F is: "+f_temp);
    }
}