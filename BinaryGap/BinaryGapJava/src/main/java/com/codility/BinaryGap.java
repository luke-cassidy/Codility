package com.codility;

/**
 * Hello world!
 *
 */
public class BinaryGap {
    public static void main(String[] args) {
        System.out.println("Starting...");

        int num = 100;
        String binaryString = Integer.toBinaryString(num);
        System.out.println("binaryString: " + binaryString);
        Solution solution = new Solution();
        System.out.println("Solution: " + solution.solution(num));

        System.out.println("Finished.");
    }

}
