package com.epam.learn.JavaBasicsRu;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner sc = new Scanner(System.in);
        int maxValue = Integer.MIN_VALUE;
        int curValue ;
        int i = 0;
        System.out.print("Please, enter a sequence: ");
        if (sc.hasNextLine()) {
            String[] string = sc.nextLine().split(" ");
            while (Integer.valueOf(string[i]) != 0) {
                curValue = Integer.valueOf(string[i++]);
                if (curValue > maxValue){
                    maxValue = curValue;
                }
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
