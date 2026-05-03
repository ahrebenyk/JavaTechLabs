package lab8;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.IO.println;

public class Main {
    static void main() {
        try {
            println("Введіть розмір масиву:");
            int size = readInt();
            if (size <= 0) {
                throw new InvalidArraySizeException(size);
            }

            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                println("Введіть %s-й елемент масиву:".formatted(i));
                array[i] = readInt();
            }
            println("Середнє значення елементів масиву: %s".formatted(calculateAverage(array)));
            println("Масив позитивних елементів масиву: %s".formatted(Arrays.toString(getPositiveElements(array))));

            println("Введіть індекс елемента масиву для виведення:");
            int index = readInt();
            int findResult = findElement(array, index);
            println("%s-й елемент масиву: %s".formatted(index, findResult));

            println("Введіть індекси елементів для ділення:");
            int a = readInt();
            int b = readInt();
            double divideResult = divideElements(array, a, b);
            println("Результат ділення: %s".formatted(divideResult));
        } catch (InvalidArraySizeException e) {
            println("Було згенеровано InvalidArraySizeException: %s".formatted(e.getMessage()));
        } catch (NoPositiveElementsException e) {
            println("Було згенеровано NoPositiveElementsException: %s".formatted(e.getMessage()));
        } catch (IndexOutOfBoundsException e) {
            println("Було згенеровано IndexOutOfBoundsException: %s".formatted(e.getMessage()));
        } catch (ArithmeticException e) {
            println("Було згенеровано ArithmeticException: %s".formatted(e.getMessage()));
        } finally {
            println("Роботу завершено");
        }
    }

    static int readInt() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                println("Помилка! Введіть коректне ціле число.");
            }
        }
    }

    static int findElement(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            println("Помилка! Некоректний індекс масиву [%s]".formatted(index));
            throw e;
        }
    }

    static int divideElements(int[] arr, int a, int b) {
        try {
            return findElement(arr, a) / findElement(arr, b);
        } catch (ArithmeticException e) {
            println("Помилка: ділення на нуль");
            throw e;
        }
    }

    static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            throw new InvalidArraySizeException(0);
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    static int[] getPositiveElements(int[] arr) {
        int[] result = Arrays.stream(arr)
                .filter(x -> x > 0)
                .toArray();

        if (result.length == 0) {
            throw new NoPositiveElementsException();
        }
        return result;
    }
}
