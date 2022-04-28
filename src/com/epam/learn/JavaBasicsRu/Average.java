package com.epam.learn.JavaBasicsRu;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        if (sc.hasNextLine()) {
            String[] string = sc.nextLine().split(" ");
            while (Integer.valueOf(string[i]) != 0) {
                result += Integer.valueOf(string[i++]);
            }
            result /= (string.length -1);
        }

        // Get a result of your code

        System.out.println(result);
    }
}
