package ru.mirea.it.ivbo.thirteen;

public class Number {
    public Number(StringBuilder number) {
        if (number.charAt(0) == '8') {
            this.number = new StringBuilder("+7" + number.substring(1, 4));
            this.number.append("-").append(number.substring(4, 7)).append("-").append(number.substring(7));
        } else
            this.number = new StringBuilder("+" + number.substring(1, 5) + "-" + number.substring(5, 8) + "-" + number.substring(8));
    }

    public StringBuilder getNumber() {
        return number;
    }

    private final StringBuilder number;

    public static void main(String[] args) {
        Number numberFirst = new Number(new StringBuilder("+10428965221"));
        Number numberSecond = new Number(new StringBuilder("89175655655"));
        System.out.println(numberFirst.getNumber());
        System.out.println(numberSecond.getNumber());
    }
}
