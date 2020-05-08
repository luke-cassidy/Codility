package com.codility;

import java.util.HashSet;

public class Solution {

    public int solution(int[] A) {
        HashSet<Integer> oddNums = new HashSet<>((A.length - 1) / 2 + 1);
        for (int num : A) {
            if (oddNums.contains(num)) {
                oddNums.remove(num);
            } else {
                oddNums.add(num);
            }
        }
        return (int) oddNums.toArray()[0];
    }
}