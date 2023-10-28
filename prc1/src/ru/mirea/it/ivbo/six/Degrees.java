package ru.mirea.it.ivbo.six;


//Напишите программу для перевода температуры по Цельсию в температуру по Кельвину и Фаренгейту.Для этого добавьте
// интерфейс Convertable у которого есть метод convert для конвертации из одной системы измерения в другую.

interface Convertable {
    void convert();
}

class toFarenheit implements Convertable {
    private float t;

    public toFarenheit(float t) {
        this.t = t;
    }

    public void convert() {
        System.out.println((this.t - 32) * 9 / 5);
    }
}

class toCelsius implements Convertable {
    private float t;

    public toCelsius(float t) {
        this.t = t;
    }

    public void convert() {
        System.out.println(this.t * 9 / 5 + 32);
    }
}

public class Degrees {
    public static void main(String[] args) {
        toFarenheit s = new toFarenheit(3);
        toCelsius f = new toCelsius(45);
        s.convert();
        f.convert();
    }
}
