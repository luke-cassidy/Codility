package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class PermMissingElemTest {

    Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testWhenAIsEmpty() {
        int[] intArray = {};
        int exp = 1;
        int act = solution.solution(intArray);
        assertEquals(exp, act);
    }

    @Test
    public void testWhenAHasOneElement() {
        int[] intArray = { 1 };
        int exp = 2;
        int act = solution.solution(intArray);
        assertEquals(exp, act);

        intArray[0] = 2;
        exp = 1;
        act = solution.solution(intArray);
        assertEquals(exp, act);
    }

    @Test
    public void testWhenAHasTwoElements() {
        int[] intArray = { 1, 2 };
        int exp = 3;
        int act = solution.solution(intArray);
        assertEquals(exp, act);

        intArray[0] = 2;
        intArray[1] = 3;
        exp = 1;
        act = solution.solution(intArray);
        assertEquals(exp, act);
    }

    @Test
    public void testWhenAManyElements() {
        int[] intArray = { 1, 2, 3, 4 };
        int exp = 5;
        int act = solution.solution(intArray);
        assertEquals(exp, act);

        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 4;
        intArray[3] = 5;

        exp = 1;
        act = solution.solution(intArray);
        assertEquals(exp, act);

        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 4;
        intArray[3] = 5;

        exp = 3;
        act = solution.solution(intArray);
        assertEquals(exp, act);
    }

    @Test
    public void testWithMaxElements() {
        int[] intArray = new int[100000];
        for (int i = 1; i < intArray.length + 1; i++) {
            intArray[i - 1] = i;
        }

        int exp = 100001;
        int act = solution.solution(intArray);
        assertEquals(exp, act);

        intArray = new int[100000];
        for (int i = 2; i < intArray.length + 2; i++) {
            intArray[i - 2] = i;
        }

        exp = 1;
        act = solution.solution(intArray);
        assertEquals(exp, act);

        intArray = new int[100000];
        int i = 1;
        int valueModifier = 0;
        while (i < (intArray.length + 1)) {
            if (i == 50000) {
                valueModifier = 1;
            }
            intArray[i - 1] = i + valueModifier;
            i++;
        }

        exp = 50000;
        act = solution.solution(intArray);
        assertEquals(exp, act);
    }

}
