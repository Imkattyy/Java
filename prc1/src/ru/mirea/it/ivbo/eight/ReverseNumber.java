package ru.mirea.it.ivbo.eight;
import java.util.Scanner;

public class ReverseNumber {
    static int reverseNumber(int number, int level) {
        if (number < 10)
            return number;

        return number % 10 * (int)Math.pow(10, level) + reverseNumber(number / 10, level - 1);
    }

    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);

        int numberToReverse = scanner.nextInt();
        System.out.println(reverseNumber(numberToReverse, String.valueOf(numberToReverse).length() - 1));
    }
}