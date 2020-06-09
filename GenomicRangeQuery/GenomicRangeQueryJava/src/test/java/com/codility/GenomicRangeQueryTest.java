package com.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class GenomicRangeQueryTest {

    Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testWhenSPAndQAreOfLengthOne() {
        String S = "A";
        int[] P = new int[] { 0 };
        int[] Q = new int[] { 0 };
        int[] act = solution.solution(S, P, Q);
        int[] exp = new int[] { 1 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        S = "T";
        P = new int[] { 0 };
        Q = new int[] { 0 };
        act = solution.solution(S, P, Q);
        exp = new int[] { 4 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhenSIsOfLengthTwoAndPAndQAreOfLengthOne() {
        String S = "AC";
        int[] P = new int[] { 0 };
        int[] Q = new int[] { 1 };
        int[] act = solution.solution(S, P, Q);
        int[] exp = new int[] { 1 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        S = "GT";
        P = new int[] { 0 };
        Q = new int[] { 1 };
        act = solution.solution(S, P, Q);
        exp = new int[] { 3 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        S = "TT";
        P = new int[] { 0 };
        Q = new int[] { 1 };
        act = solution.solution(S, P, Q);
        exp = new int[] { 4 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        S = "CG";
        P = new int[] { 1 };
        Q = new int[] { 1 };
        act = solution.solution(S, P, Q);
        exp = new int[] { 3 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhenSIsOfLengthOneAndPAndQAreOfLengthTwo() {
        String S = "A";
        int[] P = new int[] { 0, 0 };
        int[] Q = new int[] { 0, 0 };
        int[] act = solution.solution(S, P, Q);
        int[] exp = new int[] { 1, 1 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        S = "C";
        P = new int[] { 0, 0 };
        Q = new int[] { 0, 0 };
        act = solution.solution(S, P, Q);
        exp = new int[] { 2, 2 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhenSPAndQAreOfLengthGreaterThanOne() {
        String S = "AC";
        int[] P = new int[] { 0, 1, 0 };
        int[] Q = new int[] { 0, 1, 1 };
        int[] act = solution.solution(S, P, Q);
        int[] exp = new int[] { 1, 2, 1 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        S = "ACG";
        P = new int[] { 1, 2, 1 };
        Q = new int[] { 1, 2, 2 };
        act = solution.solution(S, P, Q);
        exp = new int[] { 2, 3, 2 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        S = "ACGT";
        P = new int[] { 0, 2, 0 };
        Q = new int[] { 1, 3, 3 };
        act = solution.solution(S, P, Q);
        exp = new int[] { 1, 3, 1 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        S = "AATT";
        P = new int[] { 0, 2, 1 };
        Q = new int[] { 1, 3, 2 };
        act = solution.solution(S, P, Q);
        exp = new int[] { 1, 4, 1 };
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWithBigNumbers() {
        int genomeSize = 100000;
        int querySize = 50000;
        char[] letterArray = new char[] { 'A', 'C', 'G', 'T' };
        char[] cArray = new char[genomeSize];

        String S = Arrays.toString(cArray);
        int[] P = new int[querySize];
        int[] Q = new int[querySize];

        int[] act = new int[querySize];
        int[] exp = new int[querySize];

        for (int i = 0; i < genomeSize; i++) {
            cArray[i] = letterArray[i % 4];
        }

        S = String.copyValueOf(cArray);

        for (int i = 0; i < querySize; i++) {
            P[i] = i * 2;
            Q[i] = i * 2 + 1;
        }

        for (int i = 0; i < querySize; i++) {
            if(i % 2 == 0) {
                exp[i] = 1;
            } else {
                exp[i] = 3;
            }
        }
       
        act = solution.solution(S, P, Q);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        Arrays.fill(cArray, 'T');
        S = String.copyValueOf(cArray);
        Arrays.fill(P, 0);
        Arrays.fill(Q, genomeSize - 1);

        Arrays.fill(exp, 4);
        act = solution.solution(S, P, Q);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

}
