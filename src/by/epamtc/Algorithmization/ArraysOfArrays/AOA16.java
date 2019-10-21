package by.epamtc.Algorithmization.ArraysOfArrays;
/*
16. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
...,n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
собой. Построить такой квадрат.
 */
public class AOA16 {
    public static void main(String[] args) {
        int n = 3;
        int temp;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = (int) (Math.random() * 11);
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
