package com.epam.learn.JavaBasicsRuArray;

public class Spiral {
    static int[][] spiral (int rows, int columns){
        int[][] result = new int[rows][columns];
        int maxElem = rows*columns;
        int firstRow = 0;
        int lastRow = rows -1;
        int firstColumn = 0;
        int lastColumn = columns -1;
        int counter = 1;
        while (counter <= maxElem) {
            // first row
            for (int i = firstColumn; i <= lastColumn; i++) {
                result[firstRow][i] = counter++;
            }
            if (counter > maxElem) break;
            firstRow++; // move first row down
            // last column
            for (int i = firstRow; i <= lastRow; i++){
                result[i][lastColumn] = counter++;
            }
            if (counter > maxElem) break;
            lastColumn--;// move last column to left
            // last row
            for (int i = lastColumn; i >= firstColumn; i--) {
                result[lastRow][i] = counter++;
            }
            if (counter > maxElem) break;
            lastRow--; // move last row up
            // first column
            for (int i = lastRow; i >= firstRow; i--){
                result[i][firstColumn] = counter++;
            }
            firstColumn++;// move last column to left
        }
        return result;
    }
    public static void main (String[] args){
        int[][] spiral = Spiral.spiral(3, 4);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
        spiral = Spiral.spiral(5, 6);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
        spiral = Spiral.spiral(1, 1);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
        spiral = Spiral.spiral(1, 2);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
        spiral = Spiral.spiral(2, 1);

        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }
}