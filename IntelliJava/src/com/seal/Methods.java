package com.seal;
import java.util.Scanner;
public class Methods {
//    public static void main(String[] args){
//        int count = 0;
//        while(count<2){
//            greeting();
//            int ans = sum();
//            System.out.println("Sum = "+ans);
//            count++;
//        }
//    }
//    static void greeting(){
//        System.out.println("Function Call, Hello World!");
//    }
//    static int sum(){
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter two integers: ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int ans = a+b;
//        return ans;
//    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = sum(num1, num2);
        System.out.println("Sum = "+ans);
        swap(num1, num2);
        System.out.println("Swapped Values without reference: "+num1+" "+num2);
        int[] arr ={num1, num2};
        swap2(arr);
        System.out.println("Swapped Values with reference: "+arr[0]+" "+arr[1]);
    }

    static void swap2(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    static void swap(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    static int sum(int a, int b){
        int ans = a+b;
        return ans;
    }
}
