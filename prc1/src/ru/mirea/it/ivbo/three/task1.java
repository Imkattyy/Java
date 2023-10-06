package ru.mirea.it.ivbo.three;
import java.util.*;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input arrays' sizes (they are similar to each other): ");
        int size =  scanner.nextInt();

        Random rand = new Random();

        float[] array1 = new float[size];
        for (int i = 0; i < size; i++) {
            array1[i] = rand.nextFloat();
        }

        float[] array2 = new float[size];
        for (int i = 0; i < size; i++) {
            array2[i] = (float) Math.random();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("first: " + array1[i] + " second: " + array2[i]);
        }
    }
}
