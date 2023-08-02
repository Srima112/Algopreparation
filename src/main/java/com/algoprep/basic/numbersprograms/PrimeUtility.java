package com.algoprep.basic.numbersprograms;

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
