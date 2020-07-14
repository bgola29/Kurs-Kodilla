package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void ArrayOperationsTestSuite() {
        // Given
        int[] number = new int[20];
        number[0] = 20;
        number[1] = 19;
        number[2] = 18;
        number[3] = 17;
        number[4] = 16;
        number[5] = 15;
        number[6] = 14;
        number[7] = 13;
        number[8] = 12;
        number[9] = 11;
        number[10] = 10;
        number[11] = 9;
        number[12] = 8;
        number[13] = 7;
        number[14] = 6;
        number[15] = 5;
        number[16] = 4;
        number[17] = 3;
        number[18] = 2;
        number[19] = 1;

        //When
       double result = ArrayOperations.getAverage(number);

        //Then
        Assert.assertEquals(10.5, result , 0.1);
    }
}
