package com.seal;

import java.util.Scanner;

public class Loops{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int limit = input.nextInt();
        for(int i=0; i<limit; i++) {
            //System.out.println("Number: " + i);
        }

        int num = limit;
        while(num>0){
            //System.out.print(num+" ");
            num--;
        }
        do{
            System.out.print(num+" ");
            num++;
        }while(num<=2*limit);
    }
}