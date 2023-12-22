package ru.mirea.it.ivbo.eleven.n1;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

// Написать программу, выводящую фамилию разработчика, дату и время
// получения задания, а также дату и время сдачи задания. Для получения
// последней даты и времени использовать класс Date из пакета java.util.*
// (Объявление Dated=newDate() или метод System.currentTimeMillis().

public class Main {
    public static void main(String args[]) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
        // кол-во миллисекунд, прошедших с 1 января 1970 года
        Date date = new Date(1698210000000L);
        Date date1 = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 24);
        calendar.set(Calendar.YEAR, 2023);
        calendar.set(Calendar.MONTH, 11);

        calendar.setTime(date1);

        System.out.println("Дата получения задания: " + sdf.format(date) +
                           ", дата сдачи: " + sdf.format(calendar.getTime()));
    }
}