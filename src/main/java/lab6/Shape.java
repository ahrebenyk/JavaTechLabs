package lab6;

import static java.lang.IO.println;

public abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
    public String getType() {
        return getClass().getSimpleName();
    }
    public void printInfo() {
        println(String.format("Type: %s, Area: %.2f, Perimeter: %.2f", getType(), getArea(), getPerimeter()));
    }
}
