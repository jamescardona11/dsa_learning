package com.company.codility.timecomplexity;

/**
 * Created by jako43 on 19/01/16.
 */
public class PermMissingElem {

    // Codility
    // Correctness 100%, Performance 100% -> 100%
    // Solution: https://codility.com/demo/results/trainingSRE688-Q4H/

    public int solution(int[] A) {
        int candidate = 0;
        int size = A.length;
        int[] numbers = new int[size + 2];


        for (int i = 0; i < size; i++) {
            numbers[A[i]] = 1;
        }

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] == 0){
                candidate = i;
                break;
            }
        }

        return candidate;
    }
}
