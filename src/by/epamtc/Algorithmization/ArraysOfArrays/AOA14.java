package by.epamtc.Algorithmization.ArraysOfArrays;

/*
14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */
public class AOA14 {
    public static void main(String[] args) {
        int column = (int) (Math.random() * 11) + 2;
        int row = column + (int) (Math.random() * 3);
        int count;
        int[][] matrix = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = 0;
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                count = j;
                for (int k = 0; k < column; k++) {
                    if (count > 0) {
                        matrix[k][j] = 1;
                        count--;
                    }
                }
                System.out.printf(" %3d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
