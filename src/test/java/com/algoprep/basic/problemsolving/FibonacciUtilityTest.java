package com.algoprep.basic.problemsolving;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciUtilityTest {

    @Test
    public void checkFibonacci()
    {
        Assert.assertEquals(34,FibonacciUtility.fibonacciOfNumber(9));
    }
}
