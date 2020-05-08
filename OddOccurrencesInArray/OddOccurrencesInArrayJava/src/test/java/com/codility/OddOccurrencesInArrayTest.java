package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class OddOccurrencesInArrayTest {

    Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testWhereAHasOneElement() {
        int[] array = { 1 };
        int exp = 1;
        int act = solution.solution(array);
        assertEquals(exp, act);
    }

    @Test
    public void testWhereAHasOddElementThatOccuesOnce() {
        int[] array = { 1, 2, 1 };
        int exp = 2;
        int act = solution.solution(array);
        assertEquals(exp, act);

        array = new int[] { 1, 2, 2, 3, 3 };
        exp = 1;
        act = solution.solution(array);
        assertEquals(exp, act);
    }

    @Test
    public void testWhereAHasOddElementThatOccuesThreeTimes() {
        int[] array = new int[] { 1, 1, 1 };
        int exp = 1;
        int act = solution.solution(array);
        assertEquals(exp, act);

        array = new int[] { 1, 1, 2, 2, 2, 3, 3 };
        exp = 2;
        act = solution.solution(array);
        assertEquals(exp, act);
    }

    @Test
    public void testWhereAHasOddElementThatOccuesManyTimes() {
        int[] array = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int exp = 1;
        int act = solution.solution(array);
        assertEquals(exp, act);

        array = new int[] { 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 4, 4 };
        exp = 1;
        act = solution.solution(array);
        assertEquals(exp, act);
    }

    @Test
    public void testWhereArrayIsBigAndHasManyDifferentNumbers() {
        int[] array = new int[1000001];
        array[0] = 0;
        int i = 1;
        while (i <= 500000) {
            array[i] = i;
            array[array.length - i] = i;
            i++;
        }
        int exp = 0;
        int act = solution.solution(array);
        assertEquals(exp, act);
    }

}
