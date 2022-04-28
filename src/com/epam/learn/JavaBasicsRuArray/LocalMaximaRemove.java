package com.epam.learn.JavaBasicsRuArray;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        //int[] array = new int[]{-3, 2, 4, 13, 5, 12, 8};
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        int[] resultN = new int[1];
        if (array.length == 1) {
            resultN[0] = array[0];
            resultN = Arrays.copyOf(resultN, resultN.length + 1);
        }
        else {
            for (int i=0; i < array.length; i++) {
                if (i == 0 & array[0] <= array[1]){
                    resultN[resultN.length - 1] = array[i];
                    resultN = Arrays.copyOf(resultN, resultN.length + 1);
                }
                if (i == array.length - 1) {
                    if (array[i - 1] >= array[i]) {
                        resultN[resultN.length - 1] = array[i];
                        resultN = Arrays.copyOf(resultN, resultN.length + 1);
                    }
                }
                if (i != 0 & i != array.length - 1){
                    if (array[i - 1] >= array[i] | array[i] <= array[i + 1]) {
                        resultN[resultN.length - 1] = array[i];
                        resultN = Arrays.copyOf(resultN, resultN.length + 1);
                    }
                }
            }
        }

        return Arrays.copyOf(resultN, resultN.length - 1);

        //throw new UnsupportedOperationException();
    }
}
