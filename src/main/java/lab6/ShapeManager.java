package lab6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ShapeManager {
    private final List<Shape> shapes = new ArrayList<>();

    void addShape(Shape shape) {
        shapes.add(shape);
    }

    void printAll() {
        shapes.forEach(Shape::printInfo);
    }

    void drawAll() {
        shapes.forEach(s -> {
            if (s instanceof Drawable d) {
                d.draw();
            }
        });
    }

    Shape findLargestArea() {
        return shapes.stream()
                .max(Comparator.comparingDouble(Shape::getArea))
                .orElse(null);
    }

    void scaleAll(double factor) {
        shapes.forEach(s -> {
            if (s instanceof Scalable sc) {
                sc.scale(factor);
            }
        });
    }
}
