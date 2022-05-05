package com.epam.learn.JavaBasicsRuClasses.Intersection;

class Point {
    private final int x, y;
    Point() {
        this(0, 0);
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;

        Point point = (Point) o;

        if (point.x != x) return false;
        if (point.y != y) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = x != 0 ? x : 0;
        result = (int) (temp ^ (temp >>> 32));
        temp = y != 0 ? y : 0;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
    }
}
