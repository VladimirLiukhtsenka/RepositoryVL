package by.epamtc.Algorithmization.ArraysOfArrays;

import java.util.Arrays;

/*
12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */
public class AOA12 {
    public static void main(String[] args) {
        int n = 5;
        int temp;
        int[][] matrix = new int[n][n];
        System.out.println("Матрица до сортировки:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Сортировка строк по возрастанию:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 1; k < matrix[0].length; k++) {
                    if (matrix[i][k - 1] > matrix[i][k]) {
                        temp = matrix[i][k - 1];
                        matrix[i][k - 1] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Сортировка строк по убыванию:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 1; k < matrix[0].length; k++) {
                    if (matrix[i][k - 1] < matrix[i][k]) {
                        temp = matrix[i][k - 1];
                        matrix[i][k - 1] = matrix[i][k];
                        matrix[i][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
