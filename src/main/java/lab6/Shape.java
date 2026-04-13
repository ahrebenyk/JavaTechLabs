package lab6;

import static java.lang.IO.println;

public abstract class Shape {
    abstract double getArea();
    abstract double getPerimeter();
    String getType() {
        return getClass().getSimpleName();
    }
    void printInfo() {
        println(String.format("Type: %s, Area: %.2f, Perimeter: %.2f", getType(), getArea(), getPerimeter()));
    }
}
