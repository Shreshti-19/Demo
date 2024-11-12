import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows1 = getRows(scanner, "first matrix");
        int cols1 = getCols(scanner, "first matrix");
        int rows2 = getRows(scanner, "second matrix");
        int cols2 = getCols(scanner, "second matrix");

        if (cols1 != rows2) {
            throw new ArithmeticException("Matrices cannot be multiplied.");
        }

        int[][] matrix1 = getMatrix(scanner, rows1, cols1, "first");
        int[][] matrix2 = getMatrix(scanner, rows2, cols2, "second");

        System.out.println("First Matrix:");
        printMatrix(matrix1);
        System.out.println("Second Matrix:");
        printMatrix(matrix2);

        
        int[][] product = multiplyMatrices(matrix1, matrix2);

        System.out.println("Product of Matrices:");
        printMatrix(product);
    }

    public static int getRows(Scanner scanner, String matrixName) {
        while (true) {
            try {
                System.out.print("Enter number of rows in " + matrixName + ": ");
                int rows = scanner.nextInt();
                if (rows <= 0) {
                    throw new IllegalArgumentException("Number of rows must be positive.");
                }
                return rows;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int getCols(Scanner scanner, String matrixName) {
        while (true) {
            try {
                System.out.print("Enter number of columns in " + matrixName + ": ");
                int cols = scanner.nextInt();
                if (cols <= 0) {
                    throw new IllegalArgumentException("Number of columns must be positive.");
                }
                return cols;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); 
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static int[][] getMatrix(Scanner scanner, int rows, int cols, String matrixName) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of " + matrixName + " matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                while (true) {
                    try {
                        System.out.print("Element [" + (i + 1) + "][" + (j + 1) + "]: ");
                        matrix[i][j] = scanner.nextInt();
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Invalid input. Please enter an integer.");
                        scanner.next(); 
                        
                    }
                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] product = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return product;
    }
}

//write a program to enter a sentence and print all its words which have first and last letter same if no such any word generate explicit exception