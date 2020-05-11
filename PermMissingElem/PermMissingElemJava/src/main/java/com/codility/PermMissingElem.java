package com.codility;

public class PermMissingElem {

    public static void main(String[] args) {
        System.out.println("Starting...");

        Solution solution = new Solution();
        int[] intArray = { 2, 3, 1, 5 };

        int ans = solution.solution(intArray);

        System.out.println("ans: " + ans);
        System.out.println("Finished.");
    }
}
