package ru.mirea.it.ivbo.eleven.n2;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            String dateString = scanner.next();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

            Date date = sdf.parse(dateString);
            Date dateNow = new Date();

            System.out.println(dateNow.compareTo(date) > 0 ? "Введенная дата была до текущей или это сегодняшний день" :
                                                             "Введенная дата после текущей");

        } catch (ParseException e) {
            System.out.println("Error parcing date. " + e.getMessage());
        }
    }
}
