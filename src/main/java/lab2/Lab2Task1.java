package lab2;

import java.util.Random;

public class Lab2Task1 {

    static void main() {
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        int c = rand.nextInt(10);
        int d = rand.nextInt(10);
        int e = rand.nextInt(10);
        double result = (double) ((a + b) * (c - d)) / e  ;
        IO.println("((%s + %s) * (%s - %s)) / %s = %s".formatted(a, b, c, d, e, result));
    }
}
