package com.codility;

public class Solution {

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int longestBinaryGap = 0;
        int count = 0;
        for (char c : binaryString.toCharArray()) {
            if (c == '0') {
                count++;
            } else if (c == '1') {
                if (count > longestBinaryGap) {
                    longestBinaryGap = count;
                }
                count = 0;
            }
        }

        return longestBinaryGap;
    }
}