package com.algoprep.basic.numbersprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberOfDigitTest {

    @Test
    public void checkCountOfDigit()
    {
        Assert.assertEquals(3,NumberOfDigit.countNumberOfDigit(121));
    }
}
