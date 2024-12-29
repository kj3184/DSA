/**
 * Info about this package doing something for package-info.java file.
 */
package org.dsa;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersectionTwoArraysTest {

    @Test
    void intersectionWithoutDuplicates() {
        ArrayList<Integer> resList=new ArrayList<Integer>();
        resList.add(1);
        resList.add(3);
        int[] a={1,2,1,3,1};
        int[] b={3,1,3,4,1};
        assertEquals(resList,IntersectionTwoArrays.intersectionWithoutDuplicates(a,b));
    }
}
