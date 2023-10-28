package ru.mirea.it.ivbo.seven;


interface MathCalculable {
    double calculatePower(double base, int exponent);
    double calculateComplexModulus(double real, double imaginary);
    double PI = 3.14159265359;
}

class MathFunc implements MathCalculable {
    public double calculatePower(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public double calculateComplexModulus(double real, double imaginary) {
        return Math.sqrt(real * real + imaginary * imaginary);
    }

    public double calculateCircleLength(double radius) {
        return 2 * PI * radius;
    }
}

public class Mathematics {
    public static void main(String[] args) {
        MathFunc mathFunc = new MathFunc();

        double radius = 5.0;
        double circumference = mathFunc.calculateCircleLength(radius);

        System.out.println("Длина окружности: " + circumference);
    }
}