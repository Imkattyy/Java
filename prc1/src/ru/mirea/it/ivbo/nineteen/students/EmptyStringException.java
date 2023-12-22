package ru.mirea.it.ivbo.nineteen.students;

public class EmptyStringException extends IllegalArgumentException {
    public EmptyStringException() {
        super("The string is empty");
    }
}
