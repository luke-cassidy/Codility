package com.codility;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class MaxCounters {
    public static void main(String[] args) {
        System.out.println("Starting...");
        Solution solution = new Solution();

        int N = 5;
        int[] A = { 3, 4, 4, 6, 1, 4, 4 };

        int[] result = solution.solution(N, A);
        System.out.println("result: " + Arrays.toString(result));
        System.out.println("Finished.");
    }
}
