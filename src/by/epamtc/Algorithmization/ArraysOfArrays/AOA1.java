package by.epamtc.Algorithmization.ArraysOfArrays;

import java.util.Arrays;

/*
1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class AOA1 {
    public static void main(String[] args) {
        int firstElement = 0;
        int lastElement = 0;
        int[][] matrix = new int[7][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Искомые столбцы:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                firstElement = matrix[0][j];
                lastElement = matrix[matrix.length - 1][j];
                if (j % 2 == 0 && firstElement > lastElement) {
                    System.out.print(" " + matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}