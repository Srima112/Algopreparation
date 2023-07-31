package com.algoprep.basic.problemsolving;

public class PrimeUtility {

    public boolean isPrimeNumber(int num)
    {
        if(FactorsUtility.numberOfFactors(num)==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
