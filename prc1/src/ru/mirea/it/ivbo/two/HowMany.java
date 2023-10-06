package ru.mirea.it.ivbo.two;
import java.sql.SQLOutput;
import java.util.Scanner;

// Напишите программу HowMany.java, которая определит, сколько слов Вы ввели с консоли.
public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the text: ");
        String inputText = scanner.nextLine();
        String[] words = inputText.split("\\s+");

        int nWords = words.length;

        System.out.println("You inputed " + nWords + " word(s).");
        scanner.close();
    }
}
