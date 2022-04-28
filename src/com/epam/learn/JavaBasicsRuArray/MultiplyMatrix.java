package com.epam.learn.JavaBasicsRuArray;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        /* Create another 2d array to store the result using the original arrays' lengths on row and column respectively. */
        int [][] result = new int[matrix1.length][matrix2[0].length];

        /* Loop through each and get product, then sum up and store the value */
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] a = { {0, 12345}, {4509, 0}, {3, 567} };
        int[][] b = { {653, 0, 25353}, {0, 61, 6} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));

        int[][] aa = new int[][]{ {0, 0}, {0, 0} };
        int[][] bb = new int[][]{ {0, 0}, {0, 0} };

        result = multiply(aa, bb);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));

        int[][] aaa = {{30223, 56835, 19644, 94775, 10242, 50271, 83250}, {50896, 33397, 64875, 86787, 87164, 99285, 9075}, {52743, 5922, 32594, 99492, 92584, 32996, 62654}, {98093, 31617, 44652, 6582, 84614, 40383, 30201}, {14361, 20809, 12289, 38296, 13949, 74108, 36174}};
        int[][] bbb = {{93529, 66170, 97035}, {58807, 51260, 27732}, {73880, 12492, 43115}, {22497, 74823, 42124}, {78170, 49138, 82901}, {64918, 52863, 12382}, {87883, 78358, 80684}};
        result = multiply(aaa, bbb);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
