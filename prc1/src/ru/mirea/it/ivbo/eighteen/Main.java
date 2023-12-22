package ru.mirea.it.ivbo.eighteen;

public class Main {
    public static void main(String[] args) {
        Exception2 exception = new Exception2();
        exception.exceptionDemo();

        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.printMessage("message");
        throwsDemo.printMessage(null);

        ThrowsDemo2 throwsDemo2 = new ThrowsDemo2();
        throwsDemo2.getKey();
    }
}
