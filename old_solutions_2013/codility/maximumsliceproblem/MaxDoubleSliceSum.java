package com.company.codility.maximumsliceproblem;

/**
 * Created by jako43 on 23/01/16.
 */
public class MaxDoubleSliceSum {

    public int solution(int[] A) {
        int size = A.length;
        int[] A1 = new int[size];
        int[] A2 = new int[size];

        for (int i = 1; i < size; i++) {
            A1[i] = Math.max(A1[i-1] + A1[i], 0)
        }

        for (int i = size-2; i > 0; i--) {
            A2[i] = Math.max(A2[i+1] + A1[i], 0)
        }

        int max = 0;
        for (int i = 0; i < size; i++) {
            max
        }
    }
}
