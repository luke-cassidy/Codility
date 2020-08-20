package com.codility;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class CodilityDemo {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] A = { 1, 3, 6, 4, 1, 2 };
        System.out.println("args: " + Arrays.toString(A));
        int result = solution.solution(A);
        System.out.println("Result: " + result);

        int[] B = { 1, 2, 3 };
        System.out.println("args: " + Arrays.toString(B));
        result = solution.solution(B);
        System.out.println("Result: " + result);

        int[] C = { -1, -3 };
        System.out.println("args: " + Arrays.toString(C));
        result = solution.solution(C);
        System.out.println("Result: " + result);

        int[] D = { 1 };
        System.out.println("args: " + Arrays.toString(D));
        result = solution.solution(D);
        System.out.println("Result: " + result);

        int[] E = { 2 };
        System.out.println("args: " + Arrays.toString(E));
        result = solution.solution(E);
        System.out.println("Result: " + result);

        int[] F = { -1000000, 1000000 };
        System.out.println("args: " + Arrays.toString(F));
        result = solution.solution(F);
        System.out.println("Result: " + result);

    }

}

class Solution {
    // public int solution(int[] A) {

    // Arrays.sort(A);
    // int minAllowableValue = 1;

    // if (A[0] > minAllowableValue || A[A.length - 1] < minAllowableValue) {
    // return minAllowableValue;
    // }

    // boolean firstValidVal = false;
    // for (int i = 0; i < A.length - 1; i++) {
    // if (A[i] < minAllowableValue) {
    // continue;
    // } else {filter
    // firstValidVal = true;
    // }

    // if (A[i] != minAllowableValue && !firstValidVal) {
    // return minAllowableValue;
    // } else {
    // int diff = A[i + 1] - A[i];
    // if (diff > 1) {
    // return A[i] + 1;
    // }
    // }
    // }

    // return A[A.length - 1] + 1;
    // }

    ////////////////////////////////////////////////////

    public int solution(int[] A) {

        int minAllowableValue = 1;

        A = Arrays.stream(A).filter((x) -> {
            return x > minAllowableValue - 1;
        }).sorted().toArray();

        if (A.length == 0 || A[0] > minAllowableValue) {
            return minAllowableValue;
        }

        for (int i = 0; i < A.length - 1; i++) {
            int diff = A[i + 1] - A[i];
            if (diff > 1 && A[i] + 1 >= minAllowableValue) {
                return A[i] + 1;
            }
        }

        return A[A.length - 1] + 1;
    }

    public int solution2(int[] A) {

        Arrays.sort(A);

        int minAllowableValue = 1;
        Integer lastVal = null;

        for (int currentVal : A) {
            if ((currentVal > minAllowableValue && lastVal == null) || (currentVal > minAllowableValue && lastVal == null)) {
                return minAllowableValue;
            }    
        }

        return A[A.length - 1] + 1;
    }

}
