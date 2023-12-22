package ru.mirea.it.ivbo.eight;
import java.util.Scanner;


public class Palindrome {
    static boolean isPalindrome(String input, int start, int end) {
        if (end - start == 1 || end - start == 0)
            return true;

        if (input.charAt(start) == input.charAt(end))
            return isPalindrome(input, start + 1, end - 1);
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wordToCheck;
        wordToCheck = scanner.nextLine();
        if (isPalindrome(wordToCheck, 0, wordToCheck.length() - 1))
            System.out.println("The word above is palindromic");
        else
            System.out.println("The word above is not palindromic");
        scanner.close();
    }
}



