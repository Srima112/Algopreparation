package com.algoprep.basic.numbersprograms;

public class Runner {
    public static void main(String[] args) {
        System.out.println("No Of Factors:"+FactorsUtility.numberOfFactors(24));
        System.out.println("No Of Factors:"+FactorsUtility.numberOfFactors(36));
        System.out.println("Fibonacci :"+FibonacciUtility.fibonacciOfNumber(9));
        System.out.println("Count Number of digit :"+NumberOfDigit.countNumberOfDigit(121));
        System.out.println("Count Number perfect squares within the given number :"+CountPerfectSquaresUtility.countPerfectSquareNumber(10));
        System.out.println("Closest Number is :"+ClosestNumberUtility.findClosestNumber(13,4));
    }
}
