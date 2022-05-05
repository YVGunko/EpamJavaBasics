package com.epam.learn.JavaBasicsRuClasses.Triangle;

public class Main {
    public static void main(String[] args) {
        double area = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 4)).area();
        System.out.println(area);

        //new Triangle(new Point(0,0), new Point(1, 0), new Point(2, 0));

        Point centroid = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 3)).centroid();

        System.out.println(centroid.getX());
        System.out.println(centroid.getY());
    }
}
