package lab7;

import lab6.*;

import java.util.List;
import java.util.Set;

import static java.lang.IO.println;

public class Main {
    static void main() {
        ShapeRepository repository = new ShapeRepository();
        repository.addShape(new Circle(10));
        repository.addShape(new Circle(3));
        repository.addShape(new Rectangle(3, 4));
        repository.addShape(new Rectangle(1, 2));
        repository.addShape(new Rectangle(1, 2));
        repository.addShape(new Triangle(1, 2, 2));
        repository.addShape(new Triangle(10, 10, 10));

        Set<String> allTypes = repository.getAllTypes();
        println("\nAll types: " + allTypes);

        int minArea = 20;
        List<Shape> shapesByArea = repository.getShapesByArea(minArea);
        println("\nShapes by min area: " + minArea);
        shapesByArea.forEach(Shape::printInfo);

        ShapeStatistics shapeStatistics = new ShapeStatistics(repository.getShapes());
        println("\nAll shapes:");
        shapeStatistics.printAll();
        println("\nShapes count all: " + shapeStatistics.countAll());
        println("\nShapes average area: " + shapeStatistics.averageArea());
        println("\nShapes count by type circle: " + shapeStatistics.countByType("Circle"));
        println("\nShapes count per type:\n" +  shapeStatistics.countPerType());
        println("\nUnique shapes:");
        shapeStatistics.findUniqueShapes().forEach(Shape::printInfo);
    }
}
