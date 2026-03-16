package lab2;

import java.util.Scanner;

import static java.lang.Math.*;

public class Lab2Task4 {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        IO.println("Введіть радіус кола x");
        double r = scanner.nextDouble();
        double s = PI * Math.pow(r, 2);
        IO.println("S = %s".formatted(s));
    }
}
