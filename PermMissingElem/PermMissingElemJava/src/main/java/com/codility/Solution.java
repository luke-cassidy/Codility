package com.codility;

public class Solution {

    public int solution(int[] A) {
        int sumA = 0;
        for (int a : A) {
            sumA += a;
        }

        int triangleNum = ((A.length + 1) * (A.length + 2)) / 2;
        return triangleNum - sumA;
    }
}