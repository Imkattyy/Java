package ru.mirea.it.ivbo.four1;

public class Matrix {
    private double[][] data;
    private int rows;
    private int cols;

    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new double[rows][cols];
    }

    public Matrix(double[][] data) {
        this.rows = data.length;
        this.cols = data[0].length;
        this.data = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                this.data[i][j] = data[i][j];
            }
        }
    }

    // Метод для сложения с другой матрицей
    public Matrix add(Matrix other) {
        if (this.rows != other.rows || this.cols != other.cols) {
            throw new IllegalArgumentException("Матрицы должны иметь одинаковые размеры для сложения.");
        }

        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] + other.data[i][j];
            }
        }
        return result;
    }

    // Метод для умножения на число
    public Matrix multiply(double scalar) {
        Matrix result = new Matrix(rows, cols);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.data[i][j] = this.data[i][j] * scalar;
            }
        }
        return result;
    }

    // Метод для умножения матриц
    public Matrix multiply(Matrix other) {
        if (this.cols != other.rows) {
            throw new IllegalArgumentException("Количество столбцов первой матрицы должно быть равно количеству строк второй матрицы.");
        }

        int resultRows = this.rows;
        int resultCols = other.cols;
        Matrix result = new Matrix(resultRows, resultCols);

        for (int i = 0; i < resultRows; i++) {
            for (int j = 0; j < resultCols; j++) {
                double sum = 0;
                for (int k = 0; k < this.cols; k++) {
                    sum += this.data[i][k] * other.data[k][j];
                }
                result.data[i][j] = sum;
            }
        }
        return result;
    }

    // Метод для вывода на печать
    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        double[][] data1 = {{1, 2, 3}, {4, 5, 6}};
        double[][] data2 = {{7, 8}, {9, 10}, {11, 12}};

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        System.out.println("Матрица 1:");
        matrix1.print();

        System.out.println("Матрица 2:");
        matrix2.print();

        Matrix sum = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sum.print();

        Matrix scaled = matrix1.multiply(2.0);
        System.out.println("Матрица 1, умноженная на 2:");
        scaled.print();

        Matrix product = matrix1.multiply(matrix2);
        System.out.println("Произведение матриц:");
        product.print();
    }
}