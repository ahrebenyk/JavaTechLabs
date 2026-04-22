package lab6;

import java.util.Objects;

import static java.lang.IO.println;
import static java.lang.String.format;

public class Rectangle extends Shape implements Drawable, Scalable {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void draw() {
        println(format("Drawing rectangle with width: %.2f, height: %.2f", width, height));
    }

    @Override
    public void scale(double factor) {
        width *= factor;
        height *= factor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

}
