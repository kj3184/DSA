package org.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MissingArrayTest {

    //    MissingArray m1=new MissingArray();
    @Test
    void missingNumberTest() {
        int[] arrNum = {8, 2, 4, 5, 3, 7, 1};
        assertEquals(6, MissingArray.missingNumber(arrNum));
    }
}
