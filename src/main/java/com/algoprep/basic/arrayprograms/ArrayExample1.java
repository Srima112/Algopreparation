package com.algoprep.basic.arrayprograms;

import java.util.Scanner;

public class ArrayExample1 {

    //public static void getArray(){
    //we have to use main method as we are using scanner class for system inputs.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter all Array Elements :");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }
    }
}
