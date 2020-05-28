package com.codility;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class MaxCountersTest {

    Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testWhereNIsOneAndLengthOfAIsOne() {
        int N = 1;
        int[] A = { 1 };
        int[] exp = { 1 };
        int[] act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 1;
        A = new int[] { 2 };
        exp = new int[] { 0 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhereNIsOneAndLengthOfAIsTwo() {
        int N = 1;
        int[] A = { 1, 1 };
        int[] exp = { 2 };
        int[] act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 1;
        A = new int[] { 1, 2 };
        exp = new int[] { 1 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhereNIsOneAndAHasManyElements() {
        int N = 1;
        int[] A = { 1, 1, 1, 1 };
        int[] exp = { 4 };
        int[] act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 1;
        A = new int[] { 1, 2, 1, 2 };
        exp = new int[] { 2 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhereNIsTwoAndLengthOfAIsOne() {
        int N = 2;
        int[] A = { 1 };
        int[] exp = { 1, 0 };
        int[] act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 2;
        A = new int[] { 2 };
        exp = new int[] { 0, 1 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 2;
        A = new int[] { 3 };
        exp = new int[] { 0, 0 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhereNIsTwoAndLengthOfAIsTwo() {
        int N = 2;
        int[] A = { 1, 1 };
        int[] exp = { 2, 0 };
        int[] act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 2;
        A = new int[] { 1, 2 };
        exp = new int[] { 1, 1 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 2;
        A = new int[] { 1, 3 };
        exp = new int[] { 1, 1 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhereNIsTwoAndAHasManyElements() {
        int N = 2;
        int[] A = { 1, 1, 1, 1 };
        int[] exp = { 4, 0 };
        int[] act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 2;
        A = new int[] { 1, 2, 1, 2 };
        exp = new int[] { 2, 2 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 2;
        A = new int[] { 2, 2, 2, 3 };
        exp = new int[] { 3, 3 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhereNIsTenAndLengthOfAIsOne() {
        int N = 10;
        int[] A = { 1 };
        int[] exp = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int[] act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 10;
        A = new int[] { 10 };
        exp = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 10;
        A = new int[] { 11 };
        exp = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhereNIsTenAndLengthOfAIsTwo() {
        int N = 10;
        int[] A = { 1, 10 };
        int[] exp = { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
        int[] act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 10;
        A = new int[] { 4, 6 };
        exp = new int[] { 0, 0, 0, 1, 0, 1, 0, 0, 0, 0 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 10;
        A = new int[] { 5, 11 };
        exp = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWhereNIsTenAndAHasManyElements() {
        int N = 10;
        int[] A = { 5, 5, 5, 5, 5, 5, 5, 5, 5, 5 };
        int[] exp = { 0, 0, 0, 0, 10, 0, 0, 0, 0, 0 };
        int[] act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 10;
        A = new int[] { 1, 1, 1, 4, 5, 6, 7, 10, 10, 10 };
        exp = new int[] { 3, 0, 0, 1, 1, 1, 1, 0, 0, 3 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 10;
        A = new int[] { 1, 1, 4, 4, 7, 7, 9, 9, 11, 2 };
        exp = new int[] { 2, 3, 2, 2, 2, 2, 2, 2, 2, 2 };
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

    @Test
    public void testWithBigNumbers() {
        int N = 100000;
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = i + 1;
        }
        int[] exp = new int[N];
        Arrays.fill(exp, 1);
        int[] act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 100000;
        A = new int[N + 2];
        for (int i = 0; i < N; i++) {
            A[i] = i + 1;
        }
        A[100000] = 100000;
        A[100001] = 100001;
        exp = new int[N];
        Arrays.fill(exp, 2);
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));

        N = 100000;
        A = new int[N];
        Arrays.fill(A, 100001);
        exp = new int[N];
        Arrays.fill(exp, 0);
        act = solution.solution(N, A);
        assertEquals(Arrays.toString(exp), Arrays.toString(act));
    }

}
