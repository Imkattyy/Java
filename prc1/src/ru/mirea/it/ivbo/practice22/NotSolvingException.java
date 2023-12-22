package ru.mirea.it.ivbo.practice22;

public class NotSolvingException extends Exception {
    public NotSolvingException() {
        super("This statement is not solving");
    }
}