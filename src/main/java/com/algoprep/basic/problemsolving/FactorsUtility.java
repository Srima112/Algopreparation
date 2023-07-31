package com.algoprep.basic.problemsolving;

public class FactorsUtility {
    public static int numberOfFactors(int num){
        int i, count=0;
        for(i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                count=count+2;
            }
        }

        return count;
    }
}
