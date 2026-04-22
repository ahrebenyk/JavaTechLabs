package lab7;

import lab6.Shape;

import java.util.*;
import java.util.stream.Collectors;

public class ShapeStatistics {

    private final List<Shape> shapes;

    public ShapeStatistics(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public int countAll() {
        return shapes.size();
    }

    public long countByType(String type) {
        return shapes.stream().filter(sh -> sh.getType().equals(type)).count();
    }

    public double averageArea() {
        return shapes.stream().mapToDouble(Shape::getArea).average().orElse(0);
    }

    public Map<String, Integer> countPerType() {
        return shapes.stream().collect(Collectors.groupingBy(
                Shape::getType,
                Collectors.summingInt(_ -> 1))
        );
    }

    public void printAll() {
        Iterator<Shape> iterator = shapes.iterator();
        while (iterator.hasNext()) {
            iterator.next().printInfo();
        }
    }

    public Set<Shape> findUniqueShapes() {
        return new HashSet<>(shapes);
    }
}
