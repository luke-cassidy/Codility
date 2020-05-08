package com.codility;

/**
 * Hello world!
 *
 */
public class OddOccurrencesInArray {
    public static void main(String[] args) {
        System.out.println("Starting...");

        int[] intArray = { 1, 2, 1, 2, 1, 3, 3, 1, 5};

        Solution solution = new Solution();
        int ans = solution.solution(intArray);

        System.out.println("ans: " + ans);
        System.out.println("Finished.");
    }
}
