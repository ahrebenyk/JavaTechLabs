package lab6;

import java.util.Objects;

import static java.lang.IO.println;
import static java.lang.String.format;

public class Circle extends Shape implements Drawable, Scalable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }
}
