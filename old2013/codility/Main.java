package com.company;

import com.company.codility.arrays.CyclicRotation;
import com.company.codility.arrays.OddOccurrencesInArray;
import com.company.codility.iterations.BinaryGap;
import com.company.codility.maximumsliceproblem.MaxDoubleSliceSum;
import com.company.codility.stack.StoneWall;
import com.company.codility.timecomplexity.FrogJmp;
import com.company.codility.timecomplexity.PermMissingElem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //binaryGap();
        //oddOccurrencesInArray();
        //cyclicRotation();
        //frogJmp();
        //permMissingElem();
        //stoneWall();

        doubleSliceSum();
    }

    public static void binaryGap(){
        int s = new BinaryGap().solution(51712);

        System.out.println(s);
    }

    public static void oddOccurrencesInArray(){
        int s = new OddOccurrencesInArray().solution(new int[]{9, 3, 9, 3, 9, 7, 3, 7, 2});

        System.out.println(s);
    }

    public static void cyclicRotation(){
        int[] s = new CyclicRotation().solution(new int[]{3, 8, 9, 7, 6}, 6);

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + "  ");
        }
    }

    public static void frogJmp(){
        int s = new FrogJmp().solution(1, 39, 1);
        System.out.println(s);
    }

    public static void permMissingElem(){
        int s = new PermMissingElem().solution(new int[]{2, 3, 1, 5});

        System.out.println(s);
    }

    public static void stoneWall(){
        int s = new StoneWall().solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8});

        System.out.println(s);
    }

    public static void doubleSliceSum(){
        int s = new MaxDoubleSliceSum().solution(new int[]{3, 2, 6, -1, 4, 5, -1, 2});

        System.out.println(s);
    }
}
