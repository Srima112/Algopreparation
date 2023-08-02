package com.algoprep.basic.arrayprograms;

public class ArrayUtility {

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }
        return sum;
    }
    public static int maxElementInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        //int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max)
            {
                max = arr[i];
            }

        }

        return max;
    }
    public static void swapElementInArray(int[] arr){
        arr[0] = arr[0]+arr[1];
        arr[1] = arr[0]-arr[1];
        arr[0] = arr[0]-arr[1];
    }
    public static void reverseElementsInArray(int[] arr){
        int j = arr.length -1 ;
        for (int i = 0; i < j; i++) {
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j]=temp;
                j-- ;
        }
    }
}
