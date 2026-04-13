package lab6;

import static java.lang.IO.println;
import static java.lang.String.format;

public class Circle extends Shape implements Drawable, Scalable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        println(format("Drawing circle with radius: %.2f", radius));
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }
}
