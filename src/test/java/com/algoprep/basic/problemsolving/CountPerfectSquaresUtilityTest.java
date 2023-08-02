package com.algoprep.basic.problemsolving;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CountPerfectSquaresUtilityTest {

    @Test
    public void checkCountPerfectSquareNumber()
    {
        Assert.assertEquals(2,+CountPerfectSquaresUtility.countPerfectSquareNumber(9));
    }
}
