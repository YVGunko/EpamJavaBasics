package com.epam.learn.JavaBasicsRuArray;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

        int[][] result = new int[matrix[0].length][matrix.length];
        // take a rows
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2, 5},
                {7, -13, 6} ,
                {4, 6, 5},
                {7, 13, 6}
        };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));

        int[][] a = { {-24853, -643535, 5687654}, {7248, 4213, 32} };
        result = transpose(a);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
