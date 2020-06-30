package com.codility;

public class Solution {

    public int[] solution(String S, int[] P, int[] Q) {

        int[] sumA = new int[S.length() + 1];
        int[] sumC = new int[S.length() + 1];
        int[] sumG = new int[S.length() + 1];
        int[] sumT = new int[S.length() + 1];

        for (int i = 0; i < S.length(); i++) {
            sumA[i + 1] = sumA[i];
            sumC[i + 1] = sumC[i];
            sumG[i + 1] = sumG[i];
            sumT[i + 1] = sumT[i];

            switch (S.charAt(i)) {
                case 'A':
                    sumA[i + 1] = sumA[i] + 1;
                    break;
                case 'C':
                    sumC[i + 1] = sumC[i] + 1;
                    break;
                case 'G':
                    sumG[i + 1] = sumG[i] + 1;
                    break;
                case 'T':
                    sumT[i + 1] = sumT[i] + 1;
            }
        }

        int[] resultArray = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            if (sumA[Q[i] + 1] - sumA[P[i]] > 0) {
                resultArray[i] = 1;
            } else if (sumC[Q[i] + 1] - sumC[P[i]] > 0) {
                resultArray[i] = 2;
            } else if (sumG[Q[i] + 1] - sumG[P[i]] > 0) {
                resultArray[i] = 3;
            } else {
                resultArray[i] = 4;
            }
        }

        return resultArray;
    }

}