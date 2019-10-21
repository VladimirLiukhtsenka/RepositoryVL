package by.epamtc.Algorithmization.ArraysOfArrays;

import java.util.Scanner;

/*
8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
public class AOA8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int temp;
        int numFromColumn;
        int numInColumn;
        int[][] matrix = new int[n][n];
        System.out.println("Начальная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Введите номер столбца, который вы хотите переместить (от 0 до " + n + " ):");
        numFromColumn = sc.nextInt();
        while (numFromColumn < 0 || numFromColumn >= n) {
            System.out.println("Введите номер столбца, который вы хотите переместить (от 0 до " + n + " ):");
            numFromColumn = sc.nextInt();
        }
        System.out.println("Введите номер столбца, куда вы вставить столбец (от 0 до " + n + " ,кроме " + numFromColumn + " ):");
        numInColumn = sc.nextInt();
        while (numInColumn < 0 || numInColumn >= n || numInColumn == numFromColumn) {
            System.out.println("Введите номер столбца, куда вы вставить столбец (от 0 до " + n + " ,кроме " + numFromColumn + " ):");
            numInColumn = sc.nextInt();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = matrix[i][j];
            }
            temp = matrix[i][numInColumn];
            matrix[i][numInColumn] = matrix[i][numFromColumn];
            matrix[i][numFromColumn] = temp;
        }
        System.out.println("Матрица после изменения:");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf(" %3d", ints[j]);
            }
            System.out.println();
        }
    }
}
