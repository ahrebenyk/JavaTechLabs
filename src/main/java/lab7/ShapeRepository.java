package lab7;

import lab6.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ShapeRepository {
    private final List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public List<Shape> getShapesByArea(double minArea) {
        return shapes.stream().filter(sh -> sh.getArea() > minArea).toList();
    }

    public Set<String> getAllTypes() {
        return shapes.stream().map(Shape::getType).collect(Collectors.toSet());
    }
}
