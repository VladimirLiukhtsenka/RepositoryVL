package by.epamtc.Algorithmization.ArraysOfArrays;

import java.util.Arrays;

/*
9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class AOA9 {
    public static void main(String[] args) {
        int row = 4;
        int column = 4;
        int maxNumColumn = 0;
        int max = Integer.MIN_VALUE;
        int[] columnsum = new int[column];
        int[][] matrix = new int[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
                columnsum[j] += matrix[i][j];
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("  " + Arrays.toString(columnsum));
        for (int i = 0; i < columnsum.length; i++) {
            if (max < columnsum[i]) {
                max = columnsum[i];
                maxNumColumn = i;
            }
        }
        System.out.println("Максимальная сумма находится в столбце №: " + maxNumColumn + " (нумерация столбцов начинается от 0)");
    }
}
