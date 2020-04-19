package com.example.gameapp;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilsUnitTest {
    @Test
    public void remove_in_array() throws Exception {
        int[] testArray = new int[]{1, 2, 3};
        int[] resultArray = ArrayUtils.removeIndex(testArray, 2);
        Assert.assertArrayEquals("Test int[] ArrayUtils.removeIndex(int[], int)", new int[]{1, 2}, resultArray);
    }
}
