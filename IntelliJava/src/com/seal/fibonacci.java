package com.seal;
import java.util.Scanner;
public class fibonacci{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Nth term you need: ");
        int limit = in.nextInt();
        int prev = 0, temp;
        int curr = 1, count = 1;
        System.out.println();
        while(count<=limit/*curr<=limit*/){
            System.out.println("Term "+count+": "+prev);
            temp = curr;
            curr = prev+curr;
            prev = temp;
            count++;
        }
        System.out.println("The "+limit+"th term is: "+prev);
    }
}