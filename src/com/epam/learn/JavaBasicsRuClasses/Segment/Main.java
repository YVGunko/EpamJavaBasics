package com.epam.learn.JavaBasicsRuClasses.Segment;

public class Main {
    public static void main(String[] args) {
        double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
        System.out.println(length);

        Segment segment = new Segment(new Point(2, 0), new Point(0, 2));
        Point midpoint = segment.middle();

        System.out.println(midpoint.getX());
        System.out.println(midpoint.getY());

        Segment first = new Segment(new Point(0, 0), new Point(4, 4));
        Segment second = new Segment(new Point(2, 0), new Point(0, 2));
        Point intersection = first.intersection(second);

        System.out.println(intersection.getX());
        System.out.println(intersection.getY());

        first = new Segment(new Point(0, 3), new Point(9, 0));
        second = new Segment(new Point(0, 2), new Point(10, 0));
        intersection = first.intersection(second);

        System.out.println(intersection.getX());
        System.out.println(intersection.getY());

        first = new Segment(new Point(2, 5), new Point(0.5, 1.5));
        second = new Segment(new Point(0, 2), new Point(5, 5));
        intersection = first.intersection(second);

        System.out.println(intersection.getX());
        System.out.println(intersection.getY());

        first = new Segment(new Point(0, 0), new Point(4, 0));
        second = new Segment(new Point(2, 1), new Point(1, 2));
        intersection = first.intersection(second);

        System.out.println(intersection == null);
    }

}
