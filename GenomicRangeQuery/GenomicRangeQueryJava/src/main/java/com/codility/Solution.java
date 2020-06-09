package com.codility;

import java.util.HashMap;

public class Solution {

    HashMap<Character, Integer> impactFactors = new HashMap<>();

    {
        impactFactors.put('A', 1);
        impactFactors.put('C', 2);
        impactFactors.put('G', 3);
        impactFactors.put('T', 4);
    }

    public int[] solution(String S, int[] P, int[] Q) {

        int[] resultArray = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            String subS = S.substring(P[i], Q[i] + 1);
            int minImpactFactor = 4;
            for (char c : subS.toCharArray()) {
                int impactFactor = impactFactors.get(c);
                if (impactFactor < minImpactFactor) {
                    minImpactFactor = impactFactor;
                }
            }
            resultArray[i] = minImpactFactor;
        }

        return resultArray;
    }

}