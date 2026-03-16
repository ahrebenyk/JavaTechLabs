package lab2;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Lab2Task2 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Введіть числа a, b");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double y = sqrt(pow(a, 2) + pow(b, 2));
        IO.println("Результат: %s".formatted(y));
    }
}
