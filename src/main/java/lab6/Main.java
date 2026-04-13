package lab6;

import static java.lang.IO.print;

public class Main {
    static void main() {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(3);
        Triangle t1 = new Triangle(3, 4, 5);
        Rectangle r1 = new Rectangle( 2, 4);

        ShapeManager shapeManager = new ShapeManager();
        shapeManager.addShape(c1);
        shapeManager.addShape(c2);
        shapeManager.addShape(t1);
        shapeManager.addShape(r1);

        shapeManager.drawAll();
        shapeManager.printAll();
        print("Shape with largest area: ");
        shapeManager.findLargestArea().printInfo();

        shapeManager.scaleAll(2);

        shapeManager.drawAll();
        shapeManager.printAll();
        print("Shape with largest area: ");
        shapeManager.findLargestArea().printInfo();
    }
}
