package com.epam.learn.JavaBasicsRuArray;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length != 0){
            int[] hold = new int[array.length];
            System.arraycopy(array, array.length-1, hold, 0, 1);
            System.arraycopy(array, 0, hold, 1, array.length-1);
            System.arraycopy(hold, 0, array, 0, array.length);
            //array = Arrays.copyOf(hold, hold.length);
        }
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length != 0 & array.length >= shift){
            int[] hold = new int[array.length];
            System.arraycopy(array, array.length-shift, hold, 0, shift);
            System.arraycopy(array, 0, hold, shift, array.length-shift);
            System.arraycopy(hold, 0, array, 0, array.length);
            array = Arrays.copyOf(hold, hold.length);
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 7, 4};
        cycleSwap(array);
        System.out.println(Arrays.toString(array));
        cycleSwap(array);
        System.out.println(Arrays.toString(array));
        cycleSwap(array);
        System.out.println(Arrays.toString(array));

        cycleSwap(array,3);
        cycleSwap(array,5);
    }
}
