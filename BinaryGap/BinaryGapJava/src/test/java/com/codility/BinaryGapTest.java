package com.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class BinaryGapTest {

    Solution solution;

    @Before
    public void setup() {
        solution = new Solution();
    }

    @Test
    public void testWithOneChar() {
        int num = Integer.parseInt("0", 2);
        int exp = 0;
        int act = solution.solution(num);
        assertEquals(exp, act);

        num = Integer.parseInt("1", 2);
        act = solution.solution(num);
        assertEquals(exp, act);
    }

    @Test
    public void testWithOnly0s() {
        int num = Integer.parseInt("000", 2);
        int exp = 0;
        int act = solution.solution(num);
        assertEquals(exp, act);
    }

    @Test
    public void testWithOnly1s() {
        int num = Integer.parseInt("111", 2);
        int exp = 0;
        int act = solution.solution(num);
        assertEquals(exp, act);
    }

    @Test
    public void testWith0sAtStart() {
        int num = Integer.parseInt("0011", 2);
        int exp = 0;
        int act = solution.solution(num);
        assertEquals(exp, act);
    }

    @Test
    public void testWith0sAtEnd() {
        int num = Integer.parseInt("1100", 2);
        int exp = 0;
        int act = solution.solution(num);
        assertEquals(exp, act);
    }

    @Test
    public void testWithSingleBinaryGapOfOne0() {
        int num = Integer.parseInt("101", 2);
        int exp = 1;
        int act = solution.solution(num);
        assertEquals(exp, act);
    }

    @Test
    public void testWithSingleBinaryGapOfMultipe0s() {
        int num = Integer.parseInt("10001", 2);
        int exp = 3;
        int act = solution.solution(num);
        assertEquals(exp, act);
    }

    @Test
    public void testWithMultipleBinaryGapsWhereSecondIsLongest() {
        int num = Integer.parseInt("01010011", 2);
        int exp = 2;
        int act = solution.solution(num);
        assertEquals(exp, act);
    }

    @Test
    public void testWithMultipleBinaryGapsWhereFirstIsLongest() {
        int num = Integer.parseInt("10010110", 2);
        int exp = 2;
        int act = solution.solution(num);
        assertEquals(exp, act);
    }

}
