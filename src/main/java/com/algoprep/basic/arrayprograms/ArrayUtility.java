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
        int ending_point = arr.length -1 ;
        int starting_point = 0;

        // always try to use while in case of we have 2 or more variable , as it is easier to write while rather than for loop
        while(starting_point<ending_point) {
                int temp = arr[starting_point];
                arr[starting_point] =arr[ending_point];
                arr[ending_point]=temp;
                starting_point++;
                ending_point-- ;
        }
    }
}
