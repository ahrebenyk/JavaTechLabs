package lab5;

import static java.lang.IO.println;

public class Lab5Task2 {

    static void main() {
        println("Calculate sum for m = 1, n = 1: " + calculateSum(1, 1)); // = 1
        println("Calculate sum for m = 3, n = 2: " + calculateSum(3, 2)); // = 1 + 4 + 9
        println("Calculate sum for m = 3, n = 3: " + calculateSum(3, 3)); // = 1 + 8 + 27
        println("Calculate sum for m = 5, n = 2: " + calculateSum(5, 2)); // = 1 + 4 + 9 + 16 + 25
    }

    public static long calculateSum(int m, int n) {
        long sum = 0;
        int x;

        for (int i = 1; i <= m; i++) {
            x = 1;
            for (int j = 1; j <= n; j++) {
                x *= i;
            }
            sum += x;
        }
        return sum;
    }
}
