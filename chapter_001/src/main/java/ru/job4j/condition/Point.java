package ru.job4j.condition;

/**
 * @author Denis Melnichenko (mailto:aspirant89@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public class Point {
    private int x;
    private int y;

    /**
     * @param x coordinate by x.
     * @param y coordinate by y.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @param that second point.
     * @return distance between two point.
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

    public static void main(String[] args) {
        Point a = new Point(0, 1);
        Point b = new Point(2, 5);
        // сделаем вызов метода
        System.out.println("x1 = " + a.x);
        System.out.println("y1 = " + a.y);
        System.out.println("x2 = " + b.x);
        System.out.println("y2 = " + b.y);

        double result = a.distanceTo(b);
        System.out.println("Расстояние между точками А и В : " + result);
    }

}