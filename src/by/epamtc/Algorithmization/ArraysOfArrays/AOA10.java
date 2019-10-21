package by.epamtc.Algorithmization.ArraysOfArrays;

/*
10. Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class AOA10 {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11) - 5;
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.print("Положительные элементы главной диагонали квадратной матрицы: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j && matrix[i][j] > 0) {
                    System.out.print(matrix[i][j] + "; ");
                }
            }
        }
    }
}
