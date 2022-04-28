package com.epam.learn.JavaBasicsRuArray;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{150};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){

        //put your code here
        boolean[] result = new boolean[array.length];
        for (int i=0; i < array.length; i++) {
            if (i <= 1) result[i] = false;
            else if (array[i] == (array[i-1]+array[i-2])) result[i] = true;
        }
        return result;
        //throw new UnsupportedOperationException();
    }
}
