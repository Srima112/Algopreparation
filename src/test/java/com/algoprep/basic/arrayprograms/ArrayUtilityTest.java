package com.algoprep.basic.arrayprograms;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayUtilityTest {

    @Test
    public void sumOfArray1(){
        int[] arr = {2,3,4,5,6};
        Assert.assertEquals(20,ArrayUtility.sumOfArray(arr));
    }
    @Test
    public void sumOfArray2(){
        int[] arr = {10,-1,3,-7};
        Assert.assertEquals(5,ArrayUtility.sumOfArray(arr));
    }
    @Test
    public void sumOfBlankArray(){
        int[] arr = { };
        Assert.assertEquals(0,ArrayUtility.sumOfArray(arr));
    }
    @Test(expectedExceptions = NullPointerException.class)
    public void sumOfNullArray(){
        ArrayUtility.sumOfArray(null);
    }
    @Test
    public void maxElementPositiveArrayElement(){
        int[] arr = {10,-1,3,-7};
        Assert.assertEquals(10,ArrayUtility.maxElementInArray(arr));
    }
    @Test
    public void maxElementForNegativeArrayElement() {
        int[] arr = {-10, -20, -30, -40};
        Assert.assertEquals(-10, ArrayUtility.maxElementInArray(arr));
    }

    @Test
    public void swapArrayElement() {
        int[] arr = {10,20};
        ArrayUtility.swapElementInArray(arr);
        Assert.assertEquals(20, arr[0]);
        Assert.assertEquals(10, arr[1]);
    }

    @Test
    public void reverseArray(){
        int[] arr = {10,20,30,40};
        ArrayUtility.reverseElementsInArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }

    }
}