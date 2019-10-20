package by.epamtc.Algorithmization.ArraysOfArrays;

/*
6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
[[1,1,1...1,1,1],[0,1,1...1,1,0],[0,0,1...1,0,0],...,[0,1,1...1,1,0],[1,1,1...1,1,1]]
 */
public class AOA6 {
    public static void main(String[] args) {
        int n = 10;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 1;
                if (j >= n / 2 && i < n / 2) {
                    if (j > n - i - 1) {
                        matrix[i][j] = 0;
                    }
                }
                if (j <= n / 2 && i < n / 2) {
                    if (j < i) {
                        matrix[i][j] = 0;
                    }
                }
                if (j >= n / 2 && i >= n / 2) {
                    if (j - i >= 1) {
                        matrix[i][j] = 0;
                    }
                }
                if (j <= n / 2 && i >= n / 2) {
                    if (j + i <= n - 2) {
                        matrix[i][j] = 0;
                    }
                }
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
