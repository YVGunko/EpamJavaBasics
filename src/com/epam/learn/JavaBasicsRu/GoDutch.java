package com.epam.learn.JavaBasicsRu;
import java.util.Scanner;
public class GoDutch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a total of the bill: ");
        int total = 0;
        if (sc.hasNext()) {
            total = sc.nextInt();
        }
        if (total < 0) System.out.println("Bill total amount cannot be negative");
        else {
            System.out.print("Enter a number of friends: ");
            int number = 0;
            if (sc.hasNext()) {
                number = sc.nextInt();
            }
            if (number <= 0) System.out.println("Number of friends cannot be negative or zero");

            else System.out.println((int) ((int) total * 1.1f) / number);
        }
    }
}
