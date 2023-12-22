package ru.mirea.it.ivbo.eight;
import java.util.Scanner;

public class MaxNumbers {
    public static void main(String args[]) {
        findMaxAmount(0, 0);
    }

    static void findMaxAmount(int currAmount, int currMax) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number != 0) {
            if (number > currMax)
                findMaxAmount(1, number);
            else if (number == currMax)
                findMaxAmount(currAmount + 1, currMax);
            else
                findMaxAmount(currAmount, currMax);
        } else {
            System.out.println(currMax);
            System.out.println(currAmount);
        }
    }
}
