package com.algoprep.basic.numbersprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeUtilityTest {
    PrimeUtility primeUtility=new PrimeUtility();


    @Test
    public void testPrimeNumber()
    {
        Assert.assertEquals(true, primeUtility.isPrimeNumber(1));
    }
    @Test
    public void testPrimeNumber2()
    {
        Assert.assertEquals(false, primeUtility.isPrimeNumber(4));
    }
}
