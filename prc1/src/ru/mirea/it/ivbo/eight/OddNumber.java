package ru.mirea.it.ivbo.eight;
import java.util.Scanner;

public class OddNumber {
    public static void main(String args[]) {
        readAndPrintOddNumber();
    }

    public static void readAndPrintOddNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number != 0) {
            if (number % 2 != 0) {
                System.out.println(number);
            }

            readAndPrintOddNumber();
        }
    }
}
