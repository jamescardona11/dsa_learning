package com.company.codility.arrays;

import java.util.Arrays;

/**
 * Created by jako43 on 18/01/16.
 */
public class CyclicRotation {

    // Codility
    // Correctness 100%
    // https://codility.com/demo/results/trainingAC8QMD-FDB/

    public int[] solution(int[] A, int K) {
        int size = A.length;
        if(size == 0) return A;

        if (K > size)
            K = (K % size);

        if(K == 0) return A;

        int[] B = Arrays.copyOfRange(A, size-K, size);
        int[] C = Arrays.copyOfRange(A, 0 , size-K);

        int[] candidate = new int[size];

        int sizeB = B.length, sizeC = C.length;
        for (int i = 0; i < sizeB; i++) {
            candidate[i] = B[i];
        }

        for (int i = 0; i < sizeC; i++) {
            candidate[i + sizeB] = C[i];
        }


        return candidate;

    }
}
