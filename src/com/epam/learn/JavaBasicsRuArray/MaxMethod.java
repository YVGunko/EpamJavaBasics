package com.epam.learn.JavaBasicsRuArray;

import java.util.Arrays;

public class MaxMethod {
    public static int max(int[] values) {
        //throw new UnsupportedOperationException();
        Arrays.sort(values);
        return values[values.length-1];
    }
    public static void main (String[] args){
        int[] vals = new int[]{ -2, Integer.MIN_VALUE, 10, 5 };
        int result = MaxMethod.max(vals);
        System.out.println(result); // true
    }
}
