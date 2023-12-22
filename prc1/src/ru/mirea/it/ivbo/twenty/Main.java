package ru.mirea.it.ivbo.twenty;

public class Main {
    public static void main(String[] args) {
        GenericClass<Integer,String,Double> jenerikClass = new GenericClass<>(20, "approksimaciya", 1.5);
        jenerikClass.outputTypeAndValue();
    }
}
