package by.epamtc.Algorithmization.ArraysOfArrays;

/*
4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
[[1,2,3...n],[n,n-1,n-2...1],[1,2,3...n],[n,n-1,n-2...1]]
 */
public class AOA4 {
    public static void main(String[] args) {
        int n = 8;
        int start = 1;
        int finish = n;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = start;
                    start++;
                } else {
                    matrix[i][j] = finish;
                    finish--;
                }
                System.out.print(" " + matrix[i][j] + " ");
            }
            start = 1;
            finish = n;
            System.out.println();
        }
    }
}
