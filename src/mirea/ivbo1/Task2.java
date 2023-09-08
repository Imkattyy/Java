package mirea.ivbo1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        int index = 0;
        do {
            sum += numbers[index];
            index++;
        } while (index < size);

        index = 0;
        while (index < size) {
            if (numbers[index] < min)
                min = numbers[index];

            if (numbers[index] > max)
                max = numbers[index];

            index++;
        }
        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);

        scanner.close();
    }
}
