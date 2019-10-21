package by.epamtc.Algorithmization.ArraysOfArrays;

/*
15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
 */
public class AOA15 {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        int max = Integer.MIN_VALUE;
        int[][] matrix = new int[row][column];
        System.out.println("Матрица до замены:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                for (int k = 0; k < column; k++) {
                    if (max < matrix[j][k]) {
                        max = matrix[j][k];
                    }
                }
            }
        }
        System.out.println("Максимальный элемент в матрице: " + max);
        System.out.println("Матрица после замены:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = max;
                }
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
