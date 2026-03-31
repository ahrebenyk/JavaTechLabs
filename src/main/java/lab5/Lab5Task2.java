package lab5;

import static java.lang.IO.println;

public class Lab5Task2 {

    static void main() {
        println("Calculate sum for m = 1, n = 1: " + calculateSum(1, 1)); // = 1
        println("Calculate sum for m = 1, n = 5: " + calculateSum(1, 5)); // = 5
        println("Calculate sum for m = 5, n = 1: " + calculateSum(5, 1)); // = 1 + 2 + 3 + 4 + 5
        println("Calculate sum for m = 4, n = 4: " + calculateSum(4, 4)); // = 4 + 8 + 12 + 16
    }

    //1n + 2n + 3n +  + mn
    public static long calculateSum(int m, int n) {
        long sum = 0;
        for (int i = 1; i <= m; i++) {
            sum += (long) i * n;
        }
        return sum;    }
}
