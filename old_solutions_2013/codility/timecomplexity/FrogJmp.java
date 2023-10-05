package com.company.codility.timecomplexity;

/**
 * Created by jako43 on 18/01/16.
 */
public class FrogJmp {

    // Codility
    // Correctness 100%, Performance 100% -> 100%
    // Solution: https://codility.com/demo/results/trainingGVP8JZ-EG9/

    // Correctness 100%, Performance 0% -> 44%
    // Solution2: https://codility.com/demo/results/trainingJKFXS3-2U7/



    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((double) (Y-X)/D);
    }

    public int solution2(int X, int Y, int D) {
        int jumps = 0;
        long sum = X;

        while(sum < Y){
            jumps++;
            sum += D;
        }
        return jumps;
    }
}
