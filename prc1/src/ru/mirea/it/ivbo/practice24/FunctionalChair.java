package ru.mirea.it.ivbo.practice24;

public class FunctionalChair implements Chair {
    @Override
    public String getType() {
        return "FunctionalChair";
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
