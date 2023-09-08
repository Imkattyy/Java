package mirea.ivbo1;

public class Task4 {
    public static void main(String[] args) {
        int n = 10;
        double harmonicSum = 0.0;

        System.out.println("Первые " + n + " чисел гармонического ряда:");

        for (int i = 1; i <= n; i++) {
            harmonicSum += 1.0 / i;
            System.out.printf("H_%d = %.4f%n", i, harmonicSum);
        }
    }
}
