package com.company.codility.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jako43 on 18/01/16.
 */
public class OddOccurrencesInArray {

    // Codility
    // Correctness 80%, Performance 50% -> 66%
    // Solution: https://codility.com/demo/results/training4U7WG5-SQ4/

    // Correctness 80%, Performance 50% -> 66%
    // Solution2: https://codility.com/demo/results/trainingZTPPY6-9CC/

    public int solution(int[] A) {
        int size = A.length;
        Arrays.sort(A);

        int candidate = A[0], t = 1;
        for (int i = 1; i < size; i++) {
            if(candidate == A[i]){
                t++;
            }else if(t != 1){
                t = 1;
                candidate = A[i];
            }else{
                break;
            }
        }

        return candidate;
    }

    public int solution2(int[] A) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        int size = A.length;
        for (int i = 0; i < size; i++) {

            int e = A[i];
            if(!hm.containsKey(e)){
                hm.put(e, 1);
            }else{
                int cant = hm.get(e) + 1;
                hm.put(e, cant);
            }
        }

        int candidate = 0;
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            if(entry.getValue() == 1){
                candidate = entry.getKey();
                break;
            }
        }

        return candidate;

    }

}
