package com.epam.learn.JavaBasicsRuArray;
import java.util.Arrays;

public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        /* Create another 2d array to store the result using the original arrays' lengths on row and column respectively. */
        int[][] result = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++)
            for (int j = 0; j < matrix2[0].length; j++)
                for (int r = 0; r < matrix1[0].length; r++)
                    result[i][j] += matrix1[i][r]*matrix2[r][j];
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code
        int[][] a = { {1, 2}, {3, 4}, {5, 6} };
        int[][] b = { {11, 12, 13}, {21, 22, 23} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));

        a = new int[][]{{0, 12345}, {4509, 0}, {3, 567}};
        b = new int[][]{{653, 0, 25353}, {0, 61, 6}};

        result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));

        a = new int[][]{ {0, 0}, {0, 0} };
        b = new int[][]{ {0, 0}, {0, 0} };

        result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));

        a = new int[][]{{30223, 56835, 19644, 94775, 10242, 50271, 83250}, {50896, 33397, 64875, 86787, 87164, 99285, 9075}, {52743, 5922, 32594, 99492, 92584, 32996, 62654}, {98093, 31617, 44652, 6582, 84614, 40383, 30201}, {14361, 20809, 12289, 38296, 13949, 74108, 36174}};
        b = new int[][]{{93529, 66170, 97035}, {58807, 51260, 27732}, {73880, 12492, 43115}, {22497, 74823, 42124}, {78170, 49138, 82901}, {64918, 52863, 12382}, {87883, 78358, 80684}};
        result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}
