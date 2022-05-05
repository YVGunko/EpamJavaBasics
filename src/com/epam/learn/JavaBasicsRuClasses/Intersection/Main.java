package com.epam.learn.JavaBasicsRuClasses.Intersection;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int k1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int b2 = scanner.nextInt();*/

        Line line1 = new Line(1,2);
        Line line2 = new Line(2,1);

        System.out.println("result is " + line1.intersection(line2));

        line1 = new Line(1,0);
        line2 = new Line(2,0);

        System.out.println("result is " + line1.intersection(line2));

        line1 = new Line(2,56);
        line2 = new Line(4,-4);

        System.out.println("result is " + line1.intersection(line2));

        line1 = new Line(0,0);
        line2 = new Line(0,0);

        System.out.println("result is " + line1.intersection(line2));

        line1 = new Line(0,0);
        line2 = new Line(0,-3);

        System.out.println("result is " + line1.intersection(line2));

    }
}
