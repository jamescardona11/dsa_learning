package com.company.codility.stack;

import java.util.*;

/**
 * Created by jako43 on 23/01/16.
 */
public class StoneWall {

    public int solution(int[] H) {
        int count = 0, size = H.length;
        Stack<Integer> pila = new Stack<>();

        for (int i = 1; i < size; i++) {
            int ant = H[i-1];
            int act = H[i];

            if(act > ant){
                pila.push(ant);
            }else if(ant > act){
                count ++;

                while (!pila.isEmpty() && act < pila.peek()){
                    pila.pop();
                    count++;
                }
            }
        }

        return count+pila.size() + 1;
    }

}
