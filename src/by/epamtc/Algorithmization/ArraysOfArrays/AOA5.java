package by.epamtc.Algorithmization.ArraysOfArrays;

/*
5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
[[1,1,1...1,1,1],[2,2,2...2,2,0],[3,3,3...3,0,0],...,[n-1,n-1,0...0,0,0],[n,0,0...0,0,0]]
 */
public class AOA5 {
    public static void main(String[] args) {
        int n = 8;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j > n - i - 1) {
                    matrix[i][j] = 0;
                } else {
                    matrix[i][j] = i + 1;
                }
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
