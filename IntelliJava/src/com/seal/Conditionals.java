package com.seal;
import java.util.Scanner;
public class Conditionals{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Salary:");
        int salary = input.nextInt();
        if (salary>=10000){
            salary = salary + 2000;
        }
        else{
            salary += 1000;
        }
        System.out.println("The final salary after bonus is: "+salary);
    }
}