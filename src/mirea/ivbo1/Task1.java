package mirea.ivbo1;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int numb_sum = 0;

        for (int number : numbers) numb_sum += number;
        int average = numb_sum / numbers.length;

        System.out.println("Сумма элементов массива: " + numb_sum);
        System.out.println("Среднее арифметическое: " + average);

    }
}
