package ru.mirea.it.ivbo.practice24;

public interface AbstractFactoryChair {
    VictorianChair createVictorianChair();
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
}