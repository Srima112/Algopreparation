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

    public static void reverseElementsInArray(int[] arr, int starting_point, int ending_point){
        // always try to use while in case of we have 2 or more variable , as it is easier to write while rather than for loop
        while(starting_point<ending_point) {
            int temp = arr[starting_point];
            arr[starting_point] =arr[ending_point];
            arr[ending_point]=temp;
            starting_point++;
            ending_point-- ;
        }
    }

    /**
     * Given N elements , rotate elements from last to first by k times
     * Example
     * {3, -2, 1 , 4, 6 , 9 ,8 }
     * rotation 1 : {8, 3, -2, 1 , 4, 6 , 9 }
     * rotation 2 : {9, 8, 3, -2, 1 , 4, 6 }
     * rotation 3 : {6, 9,8, 3, -2, 1 , 4}
     * Solution
     * 1. Reverse whole array
     * 2. Reverse First K elements
     * 3. Reverse Elements post K
     * @param arr
     */
    public static void rotateAnArray(int[] arr, int k){
        //for k > n
        k = k%arr.length;
        //1. Reverse whole array
        reverseElementsInArray(arr,0,arr.length-1);
        //2. Reverse First K elements
        reverseElementsInArray(arr,0,k-1);
        //3. Reverse Elements post K
        reverseElementsInArray(arr,k,arr.length-1);
    }

    /**
     * Given an array count total no of elements having at least 1 element greater than itself
     * based on finding max number
     */
    public static void countNoOfElementGreaterThanItself(int[] arr, int num){
        //find no of occurance for max element

    }

    /**
     * It can be optimized using two pinter array
     * @param arr
     * @param sum
     * @return
     */
    public static boolean twoSum(int[] arr, int sum){
        int n = arr.length;
        boolean result =false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i]+arr[j]==sum)
                    result = true;
            }
        }
        return result;
    }


    }
