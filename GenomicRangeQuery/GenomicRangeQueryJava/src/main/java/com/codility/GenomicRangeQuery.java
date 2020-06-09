package com.codility;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class GenomicRangeQuery {
    public static void main(String[] args) {
        System.out.println("Starting...");

        String S = "CAGCCTA";
        int[] P = new int[] { 2, 5, 0 };
        int[] Q = new int[] { 4, 5, 6 };

        Solution solution = new Solution();
        int[] result = solution.solution(S, P, Q);

        System.out.println("args -> S: " + S + ", P: " + Arrays.toString(P) + ", Q: " + Arrays.toString(Q));
        System.out.println("result: " + Arrays.toString(result));

        System.out.println("Finished.");
    }
}
