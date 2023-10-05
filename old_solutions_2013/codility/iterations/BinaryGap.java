package com.company.codility.iterations;

import java.util.StringTokenizer;

/**
 * Created by jako43 on 18/01/16.
 */
public class BinaryGap {

    // Codility
    // Correctness 80%
    // https://codility.com/demo/results/trainingC4RPX8-WMT/

    public int solution(int N){
        int candidate = 0;
        String toBinary = Integer.toBinaryString(N);
        //System.out.println("Binary Number: " +toBinary);


        StringTokenizer st = new StringTokenizer(toBinary, "1+");

        if(!st.hasMoreTokens()) return candidate;

        candidate = st.nextToken().length();

        while (st.hasMoreTokens()){
            int e = st.nextToken().length();

            if(e > candidate)
                candidate = e;
        }

        return candidate;
    }
}
