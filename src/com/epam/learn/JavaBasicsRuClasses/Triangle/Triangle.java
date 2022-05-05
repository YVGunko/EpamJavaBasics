package com.epam.learn.JavaBasicsRuClasses.Triangle;

public class Triangle {
    private final Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        isExist();
    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }

    boolean isExist(){
        double r = length(this.a, this.b);
        double s = length(this.a, this.c);
        double t = length(this.b, this.c);
        // Condition check over sides of triangle
        if (r < 0 || s < 0 || t < 0 || (r + s <= t)
                || r + t <= s || s + t <= r)
            throw new IllegalArgumentException();
        return true;
    }
    double area(){
        double[] sides = sides();
        double result = 0L;
        if (isExist()) {
            // Finding Semi perimeter of the triangle
            // using formula
            double S = (sides[0] + sides[1] + sides[2]) / 2;

            // Finding the area of the triangle
            result = (double) Math.sqrt(S * (S - sides[0]) * (S - sides[1])
                    * (S - sides[2]));
        }
        return result;
    }
    Point centroid(){
        // Formula to calculate centroid
        double x = (this.a.getX() + this.b.getX() + this.c.getX()) / 3;
        double y = (this.a.getY() + this.b.getY() + this.c.getY()) / 3;
        return new Point(x,y);
    }
    double length(Point a, Point b) {
        double xDistanceSquare = Math.pow(a.getX() - b.getX(), 2);
        double yDistanceSquare = Math.pow(a.getY() - b.getY(), 2);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }
    double[] sides(){
        double[] result = new double[3];
        result[0] = length(this.a, this.b);
        result[1] = length(this.a, this.c);
        result[2] = length(this.b, this.c);
        return result;
    }
}
