package ru.mirea.it.ivbo.eleven.n3;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String format = "dd.MM.yyyy HH:mm:ss";
        System.out.println(format);
        String str = sc.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date date = sdf.parse(str);
        Student student = new Student("Oleg", 22, date, 3.4);
        student.outDate();
    }
}
