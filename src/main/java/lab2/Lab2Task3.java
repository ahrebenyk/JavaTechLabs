package lab2;

import java.util.Scanner;

import static java.lang.Math.*;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;

public class Lab2Task3 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Введіть значення x в градусах");
        double xDeg = scanner.nextDouble();
        double xRad = xDeg * PI / 180;

        IO.println("sin(x) = %s".formatted(sin(xRad)));
        IO.println("cos(x) = %s".formatted(cos(xRad)));
        IO.println("tan(x) = %s".formatted(tan(xRad)));
    }
}
