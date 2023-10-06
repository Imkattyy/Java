package ru.mirea.it.ivbo.one;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите число, факториал которого хотите вычислить: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println("Факториал " + number + " равен " + calculateFactorial(number));
        scanner.close();

    }

    public static long calculateFactorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Факториал отрицательного числа не определен.");

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}


