package ru.mirea.it.ivbo.fourteen;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static void checkText (String text) {
        Pattern pattern1 = Pattern.compile("^abcdefghijklmnopqrstuv18340$");
        Matcher matcher1 = pattern1.matcher(text);

        if (matcher1.matches()) {
            System.out.println("Строка соответствует шаблону.");
        } else {
            System.out.println("Строка не соответствует шаблону.");
        }
    }
    private static void checkDate (String date) {
        Pattern pattern = Pattern.compile("^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(19\\d{2}|[2-9]\\d{3})$");
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches()) {
            System.out.println(date + ": Верный формат даты.");
        } else {
            System.out.println(date + ": Неверный формат даты.");
        }
    }

    private static void checkMail (String email) {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            System.out.println(email + ": Верный формат email.");
        } else {
            System.out.println(email + ": Неверный формат email.");
        }
    }

    private static void checkPassword (String password) {
        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d_]{8,}$");
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println(password + ": Надежный пароль.");
        } else {
            System.out.println(password + ": Ненадежный пароль.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // #2
        System.out.println("Введите строку: ");
        String input = scanner.nextLine();
        checkText(input);


        // #3
        System.out.println("Введите дату:");
        input = scanner.nextLine();
        checkDate(input);

        // #6
        System.out.println("Введите адрес эл. почты:");
        input = scanner.nextLine();
        checkMail(input);

        // #7
        System.out.println("Введите пароль:");
        input = scanner.nextLine();
        checkPassword(input);
    }
}
