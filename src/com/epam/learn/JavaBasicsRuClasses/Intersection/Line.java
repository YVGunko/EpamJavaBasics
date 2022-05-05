package com.epam.learn.JavaBasicsRuClasses.Intersection;
/**
 * Линия, выраженная уравнением вида y = k * x + b
 */
class Line {
    private final int K;
    private final int B;
/*
    Line(Point a, Point b) {
        if (a.equals(b))
            throw new IllegalArgumentException("Points are equal. There are endless number of lines through one point.");
        int A = a.getY() - b.getY();
        int B = b.getX() - a.getX();
        if (B == 0)
            throw new IllegalArgumentException("Points lay on same vertical line.");
        int C = a.getX() * b.getY() - b.getX() * a.getY();
        this.k = - A / B;
        this.b = - C / B;
    }*/

    Line(int k, int b) {
        this.K = k;
        this.B = b;
    }

    /**
     * Возвращает угловой коэффициент линии из формулы вида y = k * x + b
     * @return угловой коэфициент
     */
    public int getK() {
        return K;
    }

    /**
     * Возвращает смещение линии из формулы вида y = k * x + b
     * @return смещение линии
     */
    public int getB() {
        return B;
    }

    Point intersection(Line other) {
        if (getK() == other.getK())
            return null;

        int x  = (other.getB() - getB()) / (getK() - other.getK());
        int y = getK() * x + getB();
        return new Point(x, y);
    }

    @Override
    public String toString() {
        return "Line{" +
                "y = " + K +
                " * x + " + B +
                '}';
    }
}

