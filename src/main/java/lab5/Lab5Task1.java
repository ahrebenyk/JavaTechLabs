package lab5;

import static java.lang.IO.println;

public class Lab5Task1 {

    static void main() {
        println("Calculate sum for n = 0: " + calculateSum(0)); // = 7/18
        println("Calculate sum for n = 1: " + calculateSum(1)); // = 7/18 + 1
        println("Calculate sum for n = 2: " + calculateSum(2)); // = 7/18 + 1 + 15/4
        println("Calculate sum for n = 3: " + calculateSum(3)); // = 7/18 + 1 + 15/4
    }

    public static double calculateSum(int n) {
        double sum = 0.0;

        for (int i = 0; i <= n; i++) {
            if (i == 3 || i == 6) {
                continue;
            }

           sum += (Math.pow(i, 2) + 2 * i + 7) / ((i - 3) * (i - 6));
        }

        return sum;
    }
}
