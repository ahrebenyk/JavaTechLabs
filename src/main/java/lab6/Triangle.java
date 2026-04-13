package lab6;

import static java.lang.IO.println;
import static java.lang.String.format;

public class Triangle extends Shape implements Drawable, Scalable {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Некоректні сторони трикутника");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void draw() {
        println(format("Drawing triangle with sides: a: %.2f, b: %.2f, c: %.2f", a, b, c));
    }

    @Override
    public void scale(double factor) {
        a *= factor;
        b *= factor;
        c *= factor;
    }
}
