package by.epamtc.Algorithmization.ArraysOfArrays;

/*
13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class AOA13 {
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
        System.out.println("Сортировка столбцов по возрастанию:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 1; k < matrix[0].length; k++) {
                    if (matrix[k - 1][j] > matrix[k][j]) {
                        temp = matrix[k - 1][j];
                        matrix[k - 1][j] = matrix[k][j];
                        matrix[k][j] = temp;
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
        System.out.println("Сортировка столбцов по убыванию:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                for (int k = 1; k < matrix[0].length; k++) {
                    if (matrix[k - 1][j] < matrix[k][j]) {
                        temp = matrix[k - 1][j];
                        matrix[k - 1][j] = matrix[k][j];
                        matrix[k][j] = temp;
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
