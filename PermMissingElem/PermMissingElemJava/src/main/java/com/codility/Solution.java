package com.codility;

public class Solution {

    public int solution(int[] A) {
        long lengthA = A.length;
        long sumA = 0;
        for (int a : A) {
            sumA += a;
        }

        long triangleNum = ((lengthA + 1) * (lengthA + 2)) / 2;
        return (int) (triangleNum - sumA);
    }
}