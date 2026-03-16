package lab3;

import java.util.Scanner;

import static java.lang.IO.println;

public class Calculator {

    static void main() {
        Scanner scanner = new Scanner(System.in);
        println("Введіть число a");
        double a = scanner.nextDouble();
        println("Введіть операцію: +, -, *, /");
        String op = scanner.next();
        println("Введіть число b");
        double b = scanner.nextDouble();
        switch (op) {
            case "+" -> println(a + b);
            case "-" -> println(a - b);
            case "*" -> println(a * b);
            case "/" -> {
                if (b == 0) {
                    println("Не можна ділити на 0");
                    break;
                }
                println(a / b);
            }
            default -> println("Некорректна операція");
        }
    }
}
