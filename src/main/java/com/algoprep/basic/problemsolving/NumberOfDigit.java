package com.algoprep.basic.problemsolving;

public class NumberOfDigit {
    public static int countNumberOfDigit(int num) {
        int rem, count = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            if(rem!=0) {
                count++;
            }
        }
        return count;
    }
}
