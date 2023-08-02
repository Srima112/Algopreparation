package com.algoprep.basic.numbersprograms;

public class FibonacciUtility {

    public static int fibonacciOfNumber(int num)
    {
        int a=0,b=1,c;
        if(num==0)
        {
            return a;
        }
        for(int i=2;i<=num;i++)
        {
          c = a+b;
          a = b;
          b = c;
        }
        return b;
    }
}
