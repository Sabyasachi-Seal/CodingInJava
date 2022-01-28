package com.seal;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args){
        if(true){
            System.out.println("True Hello World");
        }
        if(false){
            System.out.println("False Hello World");
        }
        int a = 10;
        if(a == 10){
            System.out.println("a is 10");
        }
        /*if(a){
            System.out.println("a is true"); // Cannot convert from boolean to int(even with type casting)
        }*/
        int count = 1;
        while(count != 6) {
            //System.out.println(count);
            count++;
        }
        for(int i=1; i!=6; i++){
            System.out.println(i);
        }
    }
}
