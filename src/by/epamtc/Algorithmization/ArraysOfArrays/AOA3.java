package by.epamtc.Algorithmization.ArraysOfArrays;

import java.util.Arrays;

/*
3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 */
public class AOA3 {
    public static void main(String[] args) {
        int[][] matrix = new int[7][7];
        int k = 3;
        int p = 4;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("k-я строка: ");
        System.out.println(Arrays.toString(matrix[k]));
        System.out.println("p-й столбец матрицы: ");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j == p) {
                    System.out.print(" " + ints[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
