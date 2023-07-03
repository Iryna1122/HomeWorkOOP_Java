import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Matrixx {
    public class Matrix<T extends Number> {
        private T[][] matrix;
        private int rows;
        private int columns;

        public Matrix(int rows, int columns) {
            matrix = (T[][]) new Number[rows][columns];
            this.rows = rows;
            this.columns = columns;
        }

        public void fillFromKeyboard() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter matrix elements:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Element at row " + (i + 1) + ", column " + (j + 1) + ": ");
                    matrix[i][j] = (T) Double.valueOf(scanner.nextDouble());
                }
            }
        }

        public void fillRandomly() {
            Random random = new Random();

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    // Generate random value based on the type T
                    // Here, assuming T is Double
                    matrix[i][j] = (T) Double.valueOf(random.nextDouble());
                }
            }
        }

        public void display() {
            for (int i = 0; i < rows; i++) {
                System.out.println(Arrays.toString(matrix[i]));
            }
        }

        public Matrix<T> add(Matrix<T> other) {
            if (rows != other.rows || columns != other.columns) {
                throw new IllegalArgumentException("Matrix dimensions do not match.");
            }

            Matrix<T> result = new Matrix<>(rows, columns);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result.matrix[i][j] = (T) Double.valueOf(matrix[i][j].doubleValue() + other.matrix[i][j].doubleValue());
                }
            }

            return result;
        }

        public Matrix<T> subtract(Matrix<T> other) {
            if (rows != other.rows || columns != other.columns) {
                throw new IllegalArgumentException("Matrix dimensions do not match.");
            }

            Matrix<T> result = new Matrix<>(rows, columns);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result.matrix[i][j] = (T) Double.valueOf(matrix[i][j].doubleValue() - other.matrix[i][j].doubleValue());
                }
            }

            return result;
        }

        public Matrix<T> multiply(Matrix<T> other) {
            if (columns != other.rows) {
                throw new IllegalArgumentException("Matrix dimensions are not compatible for multiplication.");
            }

            Matrix<T> result = new Matrix<>(rows, other.columns);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < other.columns; j++) {
                    double sum = 0;

                    for (int k = 0; k < columns; k++) {
                        sum += matrix[i][k].doubleValue() * other.matrix[k][j].doubleValue();
                    }

                    result.matrix[i][j] = (T) Double.valueOf(sum);
                }
            }

            return result;
        }

        public Matrix<T> divide(Matrix<T> other) {
            if (rows != other.rows || columns != other.columns) {
                throw new IllegalArgumentException("Matrix dimensions do not match.");
            }

            Matrix<T> result = new Matrix<>(rows, columns);

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    result.matrix[i][j] = (T) Double.valueOf(matrix[i][j].doubleValue() / other.matrix[i][j].doubleValue());
                }
            }

            return result;
        }

        public T findMax() {
            T max = matrix[0][0];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j].doubleValue() > max.doubleValue()) {
                        max = matrix[i][j];
                    }
                }
            }

            return max;
        }

        public T findMin() {
            T min = matrix[0][0];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (matrix[i][j].doubleValue() < min.doubleValue()) {
                        min = matrix[i][j];
                    }
                }
            }

            return min;
        }

        public double calculateAverage() {
            double sum = 0;

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    sum += matrix[i][j].doubleValue();
                }
            }

            return sum / (rows * columns);
        }
    }

    public static void main(String[]arg)
    {

    }
}
