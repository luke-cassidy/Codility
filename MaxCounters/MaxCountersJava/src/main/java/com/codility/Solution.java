package com.codility;

import java.util.Arrays;

public class Solution {

    public int[] solution(int N, int[] A) {
        //TODO: Find solution to reduce time comlpexity
        int[] counterArray = new int[N];
        int maxCount = 0;
        for (int a : A) {
            if (a == N + 1) {
                Arrays.fill(counterArray, maxCount);
            } else {
                if (++counterArray[a - 1] > maxCount) {
                    maxCount++;
                }
            }
        }
        return counterArray;
    }

}