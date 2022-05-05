package com.epam.learn.JavaBasicsRuClasses.Segment;

public class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        if (start == null || end == null)
            throw new IllegalArgumentException("Arguments can't be null");
        if (start.equals(end))
            throw new IllegalArgumentException("The points must differ");
        this.start = start;
        this.end = end;
    }

    double length() {
        double xDistanceSquare = Math.pow(start.getX() - end.getX(), 2);
        double yDistanceSquare = Math.pow(start.getY() - end.getY(), 2);
        return Math.sqrt(xDistanceSquare + yDistanceSquare);
    }

    Point middle() {
        return new Point( (start.getX() + end.getX()) / 2,
                (start.getY() + end.getY()) / 2 );
    }

    Point intersection(Segment another) {
        //if (getStart().getX() == another.getStart().getX())
        //    return null;
        double dx1 = getEnd().getX() - getStart().getX();
        double dy1 = getEnd().getY() - getStart().getY();
        double dx2 = another.getEnd().getX() - another.getStart().getX();
        double dy2 = another.getEnd().getY() - another.getStart().getY();
        double dxx = getStart().getX() - another.getStart().getX();
        double dyy = getStart().getY() - another.getStart().getY();
        double div, t, s;

        div = dy2*dx1-dx2*dy1;
        if (Math.abs(div) < 1.0e-10) return null;

        t = (dx1*dyy-dy1*dxx) / div;
        if (t < 0 || t > 1.0)
            return null; //intersection outside the first segment
        s = (dx2*dyy-dy2*dxx) / div;
        if (s < 0 || s > 1.0)
            return null;  //intersection outside the second segment
        return new Point(getStart().getX() + s * dx1, getStart().getY() + s * dy1);

    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }
}
