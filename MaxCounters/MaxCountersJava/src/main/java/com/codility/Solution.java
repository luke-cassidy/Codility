package com.codility;

public class Solution {

    public int[] solution(int N, int[] A) {
        int[] counterArray = new int[N];
        int maxCount = 0;
        int minCount = 0;
        for (int a : A) {
            if (a == N + 1) {
                minCount = maxCount;
            } else {
                if (counterArray[a - 1] < minCount) {
                    counterArray[a - 1] = minCount;
                }
                if (++counterArray[a - 1] > maxCount) {
                    maxCount++;
                }
            }
        }
        for (int i = 0; i < counterArray.length; i++) {
            if (counterArray[i] < minCount) {
                counterArray[i] = minCount;
            }
        }
        return counterArray;
    }

}