package com.seal;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter N");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        for(int i: arr){
            //System.out.println(i);
            arr[i] = arr[i];
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
